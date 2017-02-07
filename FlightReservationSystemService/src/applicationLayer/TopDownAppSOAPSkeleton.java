/**
 * TopDownAppSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package applicationLayer;

public class TopDownAppSOAPSkeleton implements applicationLayer.TopDownApp_PortType, org.apache.axis.wsdl.Skeleton {
    private applicationLayer.TopDownApp_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("login", _params, new javax.xml.namespace.QName("", "loginReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://applicationLayer", "login"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("login") == null) {
            _myOperations.put("login", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("login")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creditCard"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "flightNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("bookTicket", _params, new javax.xml.namespace.QName("", "bookingNum"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://applicationLayer", "bookTicket"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bookTicket") == null) {
            _myOperations.put("bookTicket", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("bookTicket")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bookingNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("issueTicket", _params, new javax.xml.namespace.QName("", "ticketNum"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://applicationLayer", "issueTicket"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("issueTicket") == null) {
            _myOperations.put("issueTicket", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("issueTicket")).add(_oper);
    }

    public TopDownAppSOAPSkeleton() {
        this.impl = new applicationLayer.TopDownAppSOAPImpl();
    }

    public TopDownAppSOAPSkeleton(applicationLayer.TopDownApp_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.login(username, password);
        return ret;
    }

    public java.lang.String bookTicket(java.lang.String creditCard, java.math.BigInteger flightNum) throws java.rmi.RemoteException
    {
    	java.lang.String ret = impl.bookTicket(creditCard, flightNum);
        return ret;
    }

    public java.lang.String issueTicket(java.math.BigInteger bookingNum) throws java.rmi.RemoteException
    {
    	java.lang.String ret = impl.issueTicket(bookingNum);
        return ret;
    }

}
