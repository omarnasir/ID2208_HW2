/**
 * BottomUpApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

public interface BottomUpApp extends java.rmi.Remote {
    public dataObjects.FlightTicketData checkAvailability(int howManyTickets, int flightNumber, java.util.Calendar date) throws java.rmi.RemoteException;
    public dataObjects.FlightCityData[] checkItinerary(java.lang.String fromCity, java.lang.String toCity) throws java.rmi.RemoteException;
    public dataObjects.FlightTicketData[] priceOfItineraries(int[] flightNumbers) throws java.rmi.RemoteException;
}
