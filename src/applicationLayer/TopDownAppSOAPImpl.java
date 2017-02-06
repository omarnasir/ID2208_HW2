/**
 * TopDownAppSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

import java.math.BigInteger;

import businessLayer.Business;

public class TopDownAppSOAPImpl implements applicationLayer.TopDownApp_PortType{
	
	private Business businesObj  = new Business();
	
    public java.math.BigInteger bookTicket(java.lang.String creditCard, java.math.BigInteger flightNum) throws java.rmi.RemoteException {
    	return BigInteger.valueOf(businesObj.bookTicket(creditCard, flightNum.intValue()).intValue());
    }

    public java.math.BigInteger issueTicket(java.math.BigInteger bookingNum) throws java.rmi.RemoteException {
    	return BigInteger.valueOf(businesObj.issueTicket(bookingNum.intValue()).intValue());
    }

}
