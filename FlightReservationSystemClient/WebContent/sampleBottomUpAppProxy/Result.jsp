<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBottomUpAppProxyid" scope="session" class="applicationLayer.BottomUpAppProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBottomUpAppProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBottomUpAppProxyid.getEndpoint();
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
        sampleBottomUpAppProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        applicationLayer.BottomUpApp getBottomUpApp10mtemp = sampleBottomUpAppProxyid.getBottomUpApp();
if(getBottomUpApp10mtemp == null){
%>
<%=getBottomUpApp10mtemp %>
<%
}else{
        if(getBottomUpApp10mtemp!= null){
        String tempreturnp11 = getBottomUpApp10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String howManyTickets_1id=  request.getParameter("howManyTickets22");
        int howManyTickets_1idTemp  = Integer.parseInt(howManyTickets_1id);
        String flightNumber_2id=  request.getParameter("flightNumber24");
        int flightNumber_2idTemp  = Integer.parseInt(flightNumber_2id);
        String date_3id=  request.getParameter("date26");
            java.util.Calendar date_3idTemp = null;
        if(!date_3id.equals("")){
        java.text.DateFormat dateFormatdate26 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdate26  = dateFormatdate26.parse(date_3id);
         date_3idTemp = new java.util.GregorianCalendar();
        date_3idTemp.setTime(dateTempdate26);
        }
        dataObjects.FlightTicketData checkAvailability13mtemp = sampleBottomUpAppProxyid.checkAvailability(howManyTickets_1idTemp,flightNumber_2idTemp,date_3idTemp);
if(checkAvailability13mtemp == null){
%>
<%=checkAvailability13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">price:</TD>
<TD>
<%
if(checkAvailability13mtemp != null){
java.lang.Integer typeprice16 = checkAvailability13mtemp.getPrice();
        String tempResultprice16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprice16));
        %>
        <%= tempResultprice16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ticketAvail:</TD>
<TD>
<%
if(checkAvailability13mtemp != null){
%>
<%=checkAvailability13mtemp.isTicketAvail()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(checkAvailability13mtemp != null){
java.lang.Integer typeid20 = checkAvailability13mtemp.getId();
        String tempResultid20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid20));
        %>
        <%= tempResultid20 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String fromCity_4id=  request.getParameter("fromCity31");
            java.lang.String fromCity_4idTemp = null;
        if(!fromCity_4id.equals("")){
         fromCity_4idTemp  = fromCity_4id;
        }
        String toCity_5id=  request.getParameter("toCity33");
            java.lang.String toCity_5idTemp = null;
        if(!toCity_5id.equals("")){
         toCity_5idTemp  = toCity_5id;
        }
        dataObjects.FlightCityData[] checkItinerary28mtemp = sampleBottomUpAppProxyid.checkItinerary(fromCity_4idTemp,toCity_5idTemp);
if(checkItinerary28mtemp == null){
%>
<%=checkItinerary28mtemp %>
<%
}else{
        String tempreturnp29 = null;
        if(checkItinerary28mtemp != null){
        java.util.List listreturnp29= java.util.Arrays.asList(checkItinerary28mtemp);
        tempreturnp29 = listreturnp29.toString();
        }
        %>
        <%=tempreturnp29%>
        <%
}
break;
case 30:
    gotMethod = true;
    String[] flightNumber_3id=  request.getParameter("flightNumbers").split(",");
    int[] flightNumber_3idTemp = new int[flightNumber_3id.length];
    for(int i=0; i<flightNumber_3idTemp.length; i++)
    {
    	flightNumber_3idTemp[i] = Integer.parseInt(flightNumber_3id[i]);
    }

    dataObjects.FlightTicketData[] checkAvailability14mtemp = sampleBottomUpAppProxyid.priceOfItineraries(flightNumber_3idTemp);
if(checkAvailability14mtemp.length > 0){
%>
<%=checkAvailability14mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">return:</TD>
<TR>
<%
for(int i=0;i<checkAvailability14mtemp.length; i++)
{
if(checkAvailability14mtemp.length > 0){
	java.lang.Integer typeid20 = checkAvailability14mtemp[i].getId();
    String tempResultid20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid20));
	java.lang.Integer typeprice16 = checkAvailability14mtemp[i].getPrice();
    String tempResultprice16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprice16));
    %>
    <TD WIDTH="5%"></TD>
	<TD COLSPAN="2" ALIGN="LEFT">price:</TD>
	<TD>
    <%= tempResultprice16 %>
    </TD>
	<TR>
	<TD WIDTH="5%"></TD>
	<TD COLSPAN="2" ALIGN="LEFT">ticketAvail:</TD>
	<TD>
    <%=checkAvailability14mtemp[i].isTicketAvail()
	%>
	</TD>
	<TR>
	<TD WIDTH="5%"></TD>
	<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
	<TD>
    <%= tempResultid20 %>
    <%
}
}%>
</TD>
</TABLE>
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