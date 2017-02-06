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
        String fromCity_1id=  request.getParameter("fromCity16");
            java.lang.String fromCity_1idTemp = null;
        if(!fromCity_1id.equals("")){
         fromCity_1idTemp  = fromCity_1id;
        }
        String toCity_2id=  request.getParameter("toCity18");
            java.lang.String toCity_2idTemp = null;
        if(!toCity_2id.equals("")){
         toCity_2idTemp  = toCity_2id;
        }
        dataObjects.FlightCityData[] checkItinerary13mtemp = sampleBottomUpAppProxyid.checkItinerary(fromCity_1idTemp,toCity_2idTemp);
if(checkItinerary13mtemp == null){
%>
<%=checkItinerary13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(checkItinerary13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(checkItinerary13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
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