package applicationLayer;

public class BottomUpAppProxy implements applicationLayer.BottomUpApp {
  private String _endpoint = null;
  private applicationLayer.BottomUpApp bottomUpApp = null;
  
  public BottomUpAppProxy() {
    _initBottomUpAppProxy();
  }
  
  public BottomUpAppProxy(String endpoint) {
    _endpoint = endpoint;
    _initBottomUpAppProxy();
  }
  
  private void _initBottomUpAppProxy() {
    try {
      bottomUpApp = (new applicationLayer.BottomUpAppServiceLocator()).getBottomUpApp();
      if (bottomUpApp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bottomUpApp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bottomUpApp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bottomUpApp != null)
      ((javax.xml.rpc.Stub)bottomUpApp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public applicationLayer.BottomUpApp getBottomUpApp() {
    if (bottomUpApp == null)
      _initBottomUpAppProxy();
    return bottomUpApp;
  }
  
  public dataObjects.FlightTicketData checkAvailability(int howManyTickets, int flightNumber, java.util.Calendar date) throws java.rmi.RemoteException{
    if (bottomUpApp == null)
      _initBottomUpAppProxy();
    return bottomUpApp.checkAvailability(howManyTickets, flightNumber, date);
  }
  
  public dataObjects.FlightCityData[] checkItinerary(java.lang.String fromCity, java.lang.String toCity) throws java.rmi.RemoteException{
    if (bottomUpApp == null)
      _initBottomUpAppProxy();
    return bottomUpApp.checkItinerary(fromCity, toCity);
  }
  
  public dataObjects.FlightTicketData[] priceOfItineraries(int[] flightNumbers) throws java.rmi.RemoteException{
    if (bottomUpApp == null)
      _initBottomUpAppProxy();
    return bottomUpApp.priceOfItineraries(flightNumbers);
  }
  
  
}