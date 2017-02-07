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
        String username_1id=  request.getParameter("username16");
            java.lang.String username_1idTemp = null;
        if(!username_1id.equals("")){
         username_1idTemp  = username_1id;
        }
        String password_2id=  request.getParameter("password18");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        java.lang.String login13mtemp = sampleTopDownAppProxyid.login(username_1idTemp,password_2idTemp);
if(login13mtemp == null){
%>
<%=login13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(login13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String creditCard_3id=  request.getParameter("creditCard23");
            java.lang.String creditCard_3idTemp = null;
        if(!creditCard_3id.equals("")){
         creditCard_3idTemp  = creditCard_3id;
        }
        String flightNum_4id=  request.getParameter("flightNum25");
            java.math.BigInteger flightNum_4idTemp = null;
        if(!flightNum_4id.equals("")){
         flightNum_4idTemp  = new java.math.BigInteger(flightNum_4id);
        }
        java.lang.String bookTicket20mtemp = sampleTopDownAppProxyid.bookTicket(creditCard_3idTemp,flightNum_4idTemp);
if(bookTicket20mtemp == null){
%>
<%=bookTicket20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(bookTicket20mtemp.toString());
        %>
        <%= tempResultreturnp21 %>
        <%
}
break;
case 27:
        gotMethod = true;
        String bookingNum_5id=  request.getParameter("bookingNum30");
            java.math.BigInteger bookingNum_5idTemp = null;
        if(!bookingNum_5id.equals("")){
         bookingNum_5idTemp  = new java.math.BigInteger(bookingNum_5id);
        }
        java.lang.String issueTicket27mtemp = sampleTopDownAppProxyid.issueTicket(bookingNum_5idTemp);
if(issueTicket27mtemp == null){
%>
<%=issueTicket27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(issueTicket27mtemp.toString());
        %>
        <%= tempResultreturnp28 %>
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