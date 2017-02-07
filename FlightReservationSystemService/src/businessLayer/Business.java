package businessLayer;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import dataObjects.*;

public class Business {
	private static FlightData flightDataObj = new FlightData();
	private static List<Integer> bookingNumbers = new ArrayList<Integer>();
	private static List<Integer> ticketNumbers = new ArrayList<Integer>();
	
	public Business()
	{
		File companyXML = new File(Business.class.getResource("/xmlFiles/flightData.xml").getFile());
		Mapper mapperObj = new Mapper();
		setFlightDataObj(mapperObj.mapperMethod(companyXML));
	}

	public static FlightData getFlightDataObj() {
		return flightDataObj;
	}

	public static void setFlightDataObj(FlightData flightDataObj) {
		Business.flightDataObj = flightDataObj;
	}
	
	public FlightCityData[] getItinerary(String fromCity, String toCity)
	{
		List<FlightCityData> flightCityDataListObj = new ArrayList<FlightCityData>();
		
		//Get all outbound flights from fromCity
		List<Integer> indexesFromCity = new ArrayList<Integer>();
		List<Integer> indexesToCity = new ArrayList<Integer>();
		
		for (int i=0; i < getFlightDataObj().getItinerary().size(); i++)
		{	
			if(getFlightDataObj().getItinerary().get(i).getFromCity().contains(fromCity))
			{
				//For Direct Flights
				if(getFlightDataObj().getItinerary().get(i).getToCity().contains(toCity))
				{
					flightCityDataListObj.add(populateFlightCityObj(i));
					return flightCityDataListObj.toArray(new FlightCityData[flightCityDataListObj.size()]);
				}
				else
				{
					indexesFromCity.add(i);
				}
			}
			if(getFlightDataObj().getItinerary().get(i).getToCity().contains(toCity))
			{
				indexesToCity.add(i);
			}
		}
		
		//Check if fromCity and toCity are found in more than one hop
		for (int i=0; i < indexesFromCity.size(); i++)
		{
			String firstHopToCity = getFlightDataObj().getItinerary().get(indexesFromCity.get(i)).getToCity();
			for (int j=0; j < indexesToCity.size(); j++)
			{
				if(getFlightDataObj().getItinerary().get(indexesToCity.get(j)).getFromCity().contains(firstHopToCity))
				{
					flightCityDataListObj.add(populateFlightCityObj(indexesFromCity.get(i)));
					flightCityDataListObj.add(populateFlightCityObj(indexesToCity.get(j)));
					return flightCityDataListObj.toArray(new FlightCityData[flightCityDataListObj.size()]);
				}
			}
		}
		return null;
	}

	public String bookTicket(String creditCard, Integer flightNum)
	{
		for (int i=0; i < getFlightDataObj().getItinerary().size(); i++)
		{
			if(getFlightDataObj().getItinerary().get(i).getFlightNum() == flightNum)
			{
				if(bookingNumbers.size() > 0)
				{
					//Process creditCard
					//Assume CC is valid
					int max = Collections.max(bookingNumbers);
					bookingNumbers.add(max + 1);
				}
				else
					bookingNumbers.add(0);
				break;
			}
		}
		if(bookingNumbers.size() > 0)
		return "Booking Number: " + bookingNumbers.get(bookingNumbers.size() - 1).toString();
		else
			return "Invalid Request";
	}
	
	public String issueTicket(Integer bookingNum)
	{
		int exists = Collections.binarySearch(bookingNumbers, bookingNum);
		if(exists > -1)
		{
			if(ticketNumbers.size() > 0)
			{
				int max = Collections.max(ticketNumbers);
				ticketNumbers.add(max + 1);
			}
			else
				ticketNumbers.add(0);
		}
		else
			return "Invalid Request";
		
		for (Iterator<Integer> iter = bookingNumbers.listIterator(); iter.hasNext(); ) {
		    Integer a = iter.next();
		    if (a == bookingNum) {
		        iter.remove();
		    }
		}
		if(ticketNumbers.size() > 0)
		return "Ticket Number: " + ticketNumbers.get(ticketNumbers.size() - 1).toString();
		else
			return "Invalid Request";
	}
	
	private FlightCityData populateFlightCityObj(int i) {
		
		FlightCityData flightCityDataObj = new FlightCityData();
		flightCityDataObj.setId(getFlightDataObj().getItinerary().get(i).getId());
		flightCityDataObj.setFlightNum(getFlightDataObj().getItinerary().get(i).getFlightNum());
		flightCityDataObj.setFromCity(getFlightDataObj().getItinerary().get(i).getFromCity());
		flightCityDataObj.setToCity(getFlightDataObj().getItinerary().get(i).getToCity());
		return flightCityDataObj;
	}

	//Start from here :)
	private FlightTicketData populateFlightTicketObj(int i){
			
			FlightTicketData flightTicketDataObj = new FlightTicketData();
			flightTicketDataObj.setId(getFlightDataObj().getItinerary().get(i).getId());
			if (getFlightDataObj().getItinerary().get(i).getTickets()>0){
				flightTicketDataObj.setTicketAvail(true);
			}		
			else {
				flightTicketDataObj.setTicketAvail(false);
			}
			flightTicketDataObj.setPrice(getFlightDataObj().getItinerary().get(i).getPrice());
			
			return flightTicketDataObj;
		}
	
	
	//Task 4
	public FlightTicketData[] getPrices(Integer[] flightNumbers) {
		
		List<FlightTicketData> ticket = new ArrayList<FlightTicketData>();
		
		for(int i=0 ; i<flightNumbers.length; i++){
			for (int j=0; j< getFlightDataObj().getItinerary().size(); j++){
				if (flightNumbers[i].intValue() == getFlightDataObj().getItinerary().get(j).getFlightNum().intValue()){
					ticket.add(populateFlightTicketObj(j));
				}
			}
		}
		
		return ticket.toArray(new FlightTicketData[ticket.size()]);
	}

	
	// Task 3
	public FlightTicketData getAvailPriceItinerary(int howManyTickets, int flightNumber, Date date) 
	{
		FlightTicketData ticket = new FlightTicketData();
		Calendar calArg = Calendar.getInstance();
		calArg.setTime(date);
		
		for (int j = 0; j < getFlightDataObj().getItinerary().size(); j++) {

			Calendar cal = Calendar.getInstance();
			cal.setTime(getFlightDataObj().getItinerary().get(j).getFlightDate().toGregorianCalendar().getTime());

			if (flightNumber == getFlightDataObj().getItinerary().get(j).getFlightNum()
					&& cal.get(Calendar.DAY_OF_MONTH) == calArg.get(Calendar.DAY_OF_MONTH)
					&& cal.get(Calendar.MONTH) == calArg.get(Calendar.MONTH)
					&& cal.get(Calendar.YEAR) == calArg.get(Calendar.YEAR)
					&& howManyTickets <= getFlightDataObj().getItinerary().get(j).getTickets()) {
				ticket = populateFlightTicketObj(j);
			}
		}
		return ticket;
	}
}