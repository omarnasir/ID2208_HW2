/**
 * BottomUpAppService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

public interface BottomUpAppService extends javax.xml.rpc.Service {
    public java.lang.String getBottomUpAppAddress();

    public applicationLayer.BottomUpApp getBottomUpApp() throws javax.xml.rpc.ServiceException;

    public applicationLayer.BottomUpApp getBottomUpApp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
