package applicationLayer;

import dataObjects.FlightCityData;

public class BottomUpApp {
	
	//Task 2
	public FlightCityData[] checkItinerary(String fromCity, String toCity)
	{
		businessLayer.Business businessObj = new businessLayer.Business();
		return businessObj.getItinerary(fromCity, toCity);
	}
}