package applicationLayer;

public class TopDownAppProxy implements applicationLayer.TopDownApp_PortType {
  private String _endpoint = null;
  private applicationLayer.TopDownApp_PortType topDownApp_PortType = null;
  
  public TopDownAppProxy() {
    _initTopDownAppProxy();
  }
  
  public TopDownAppProxy(String endpoint) {
    _endpoint = endpoint;
    _initTopDownAppProxy();
  }
  
  private void _initTopDownAppProxy() {
    try {
      topDownApp_PortType = (new applicationLayer.TopDownApp_ServiceLocator()).getTopDownAppSOAP();
      if (topDownApp_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)topDownApp_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)topDownApp_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (topDownApp_PortType != null)
      ((javax.xml.rpc.Stub)topDownApp_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public applicationLayer.TopDownApp_PortType getTopDownApp_PortType() {
    if (topDownApp_PortType == null)
      _initTopDownAppProxy();
    return topDownApp_PortType;
  }
  
  public java.math.BigInteger bookTicket(java.lang.String creditCard, java.math.BigInteger flightNum) throws java.rmi.RemoteException{
    if (topDownApp_PortType == null)
      _initTopDownAppProxy();
    return topDownApp_PortType.bookTicket(creditCard, flightNum);
  }
  
  public java.math.BigInteger issueTicket(java.math.BigInteger bookingNum) throws java.rmi.RemoteException{
    if (topDownApp_PortType == null)
      _initTopDownAppProxy();
    return topDownApp_PortType.issueTicket(bookingNum);
  }
  
  
}