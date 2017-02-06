/**
 * BottomUpAppServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

public class BottomUpAppServiceLocator extends org.apache.axis.client.Service implements applicationLayer.BottomUpAppService {

    public BottomUpAppServiceLocator() {
    }


    public BottomUpAppServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BottomUpAppServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BottomUpApp
    private java.lang.String BottomUpApp_address = "http://localhost:8080/FlightReservationSystem/services/BottomUpApp";

    public java.lang.String getBottomUpAppAddress() {
        return BottomUpApp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BottomUpAppWSDDServiceName = "BottomUpApp";

    public java.lang.String getBottomUpAppWSDDServiceName() {
        return BottomUpAppWSDDServiceName;
    }

    public void setBottomUpAppWSDDServiceName(java.lang.String name) {
        BottomUpAppWSDDServiceName = name;
    }

    public applicationLayer.BottomUpApp getBottomUpApp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BottomUpApp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBottomUpApp(endpoint);
    }

    public applicationLayer.BottomUpApp getBottomUpApp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            applicationLayer.BottomUpAppSoapBindingStub _stub = new applicationLayer.BottomUpAppSoapBindingStub(portAddress, this);
            _stub.setPortName(getBottomUpAppWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBottomUpAppEndpointAddress(java.lang.String address) {
        BottomUpApp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (applicationLayer.BottomUpApp.class.isAssignableFrom(serviceEndpointInterface)) {
                applicationLayer.BottomUpAppSoapBindingStub _stub = new applicationLayer.BottomUpAppSoapBindingStub(new java.net.URL(BottomUpApp_address), this);
                _stub.setPortName(getBottomUpAppWSDDServiceName());
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
        if ("BottomUpApp".equals(inputPortName)) {
            return getBottomUpApp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://applicationLayer", "BottomUpAppService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://applicationLayer", "BottomUpApp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BottomUpApp".equals(portName)) {
            setBottomUpAppEndpointAddress(address);
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
