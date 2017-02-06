/**
 * TopDownApp_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

public class TopDownApp_ServiceLocator extends org.apache.axis.client.Service implements applicationLayer.TopDownApp_Service {

    public TopDownApp_ServiceLocator() {
    }


    public TopDownApp_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TopDownApp_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TopDownAppSOAP
    private java.lang.String TopDownAppSOAP_address = "http://localhost:8080/FlightReservationSystem/services/TopDownApp";

    public java.lang.String getTopDownAppSOAPAddress() {
        return TopDownAppSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TopDownAppSOAPWSDDServiceName = "TopDownAppSOAP";

    public java.lang.String getTopDownAppSOAPWSDDServiceName() {
        return TopDownAppSOAPWSDDServiceName;
    }

    public void setTopDownAppSOAPWSDDServiceName(java.lang.String name) {
        TopDownAppSOAPWSDDServiceName = name;
    }

    public applicationLayer.TopDownApp_PortType getTopDownAppSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TopDownAppSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTopDownAppSOAP(endpoint);
    }

    public applicationLayer.TopDownApp_PortType getTopDownAppSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            applicationLayer.TopDownAppSOAPStub _stub = new applicationLayer.TopDownAppSOAPStub(portAddress, this);
            _stub.setPortName(getTopDownAppSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTopDownAppSOAPEndpointAddress(java.lang.String address) {
        TopDownAppSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (applicationLayer.TopDownApp_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                applicationLayer.TopDownAppSOAPStub _stub = new applicationLayer.TopDownAppSOAPStub(new java.net.URL(TopDownAppSOAP_address), this);
                _stub.setPortName(getTopDownAppSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TopDownAppSOAP".equals(inputPortName)) {
            return getTopDownAppSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://applicationLayer", "TopDownApp");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://applicationLayer", "TopDownAppSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TopDownAppSOAP".equals(portName)) {
            setTopDownAppSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
