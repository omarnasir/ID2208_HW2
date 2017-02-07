/**
 * TopDownAppSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import businessLayer.Business;

public class TopDownAppSOAPImpl implements applicationLayer.TopDownApp_PortType {

	{
		userinfo();
	}

	public static final String SECRET_TOKEN = UUID.randomUUID().toString();
	private static Map<String, String> users;

	private static void userinfo() {
		users = new HashMap<>();
		users.put("Anne", "123");
		users.put("Peter", "132");
		users.put("Tom", "111");
	}

	private Business businesObj = new Business();

	public java.lang.String login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
		if (users.containsKey(username) && password.equals(users.get(username))) {
			return SECRET_TOKEN;
		}
		else 
			return "Not authorized";
	}

	public java.lang.String bookTicket(java.lang.String creditCard, java.math.BigInteger flightNum)
			throws java.rmi.RemoteException {
		return businesObj.bookTicket(creditCard, flightNum.intValue());
	}

	public java.lang.String issueTicket(java.math.BigInteger bookingNum) throws java.rmi.RemoteException {
		return businesObj.issueTicket(bookingNum.intValue());
	}

}
