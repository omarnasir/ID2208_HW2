/**
 * TopDownApp_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

public interface TopDownApp_Service extends javax.xml.rpc.Service {
    public java.lang.String getTopDownAppSOAPAddress();

    public applicationLayer.TopDownApp_PortType getTopDownAppSOAP() throws javax.xml.rpc.ServiceException;

    public applicationLayer.TopDownApp_PortType getTopDownAppSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
