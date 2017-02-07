package applicationLayer;

import java.util.Date;

import dataObjects.*;

public class BottomUpApp {
	
	//Task 2
	public FlightCityData[] checkItinerary(String fromCity, String toCity)
	{
		businessLayer.Business businessObj = new businessLayer.Business();
		return businessObj.getItinerary(fromCity, toCity);
	}

	//Task3	
	public FlightTicketData checkAvailability(Integer howManyTickets, Integer flightNumber, Date date) // same day, month and year
	{
		businessLayer.Business businessObj = new businessLayer.Business();
		return businessObj.getAvailPriceItinerary(howManyTickets, flightNumber, date); // availability and price of itinerary
	}
	
	//Task4
	public FlightTicketData[] priceOfItineraries(Integer[] flightNumbers)
	{
		businessLayer.Business businessObj = new businessLayer.Business();
		return businessObj.getPrices(flightNumbers); //price of itinerary
	}
}