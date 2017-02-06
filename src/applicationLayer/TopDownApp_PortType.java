/**
 * TopDownApp_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

public interface TopDownApp_PortType extends java.rmi.Remote {
    public java.math.BigInteger bookTicket(java.lang.String creditCard, java.math.BigInteger flightNum) throws java.rmi.RemoteException;
    public java.math.BigInteger issueTicket(java.math.BigInteger bookingNum) throws java.rmi.RemoteException;
}
