package businessLayer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import dataObjects.FlightCityData;
import dataObjects.FlightData;

public class Business {
	private static FlightData flightDataObj = new FlightData();
	
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

	private FlightCityData populateFlightCityObj(int i) {
		
		FlightCityData flightCityDataObj = new FlightCityData();
		flightCityDataObj.setId(getFlightDataObj().getItinerary().get(i).getId());
		flightCityDataObj.setFlightNum(getFlightDataObj().getItinerary().get(i).getFlightNum());
		flightCityDataObj.setFromCity(getFlightDataObj().getItinerary().get(i).getFromCity());
		flightCityDataObj.setToCity(getFlightDataObj().getItinerary().get(i).getToCity());
		return flightCityDataObj;
	}
}