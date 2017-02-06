<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleTopDownAppProxyid" scope="session" class="applicationLayer.TopDownAppProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleTopDownAppProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleTopDownAppProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleTopDownAppProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        applicationLayer.TopDownApp_PortType getTopDownApp_PortType10mtemp = sampleTopDownAppProxyid.getTopDownApp_PortType();
if(getTopDownApp_PortType10mtemp == null){
%>
<%=getTopDownApp_PortType10mtemp %>
<%
}else{
        if(getTopDownApp_PortType10mtemp!= null){
        String tempreturnp11 = getTopDownApp_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String creditCard_1id=  request.getParameter("creditCard16");
            java.lang.String creditCard_1idTemp = null;
        if(!creditCard_1id.equals("")){
         creditCard_1idTemp  = creditCard_1id;
        }
        String flightNum_2id=  request.getParameter("flightNum18");
            java.math.BigInteger flightNum_2idTemp = null;
        if(!flightNum_2id.equals("")){
         flightNum_2idTemp  = new java.math.BigInteger(flightNum_2id);
        }
        java.math.BigInteger bookTicket13mtemp = sampleTopDownAppProxyid.bookTicket(creditCard_1idTemp,flightNum_2idTemp);
if(bookTicket13mtemp == null){
%>
<%=bookTicket13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(bookTicket13mtemp.toString());
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String bookingNum_3id=  request.getParameter("bookingNum23");
            java.math.BigInteger bookingNum_3idTemp = null;
        if(!bookingNum_3id.equals("")){
         bookingNum_3idTemp  = new java.math.BigInteger(bookingNum_3id);
        }
        java.math.BigInteger issueTicket20mtemp = sampleTopDownAppProxyid.issueTicket(bookingNum_3idTemp);
if(issueTicket20mtemp == null){
%>
<%=issueTicket20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(issueTicket20mtemp.toString());
        %>
        <%= tempResultreturnp21 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>