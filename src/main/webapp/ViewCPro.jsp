<%@page import="Car_Models.Custumer_model"%>
<%@page import="Org_Car_Services.Customer_ServiceImp"%>
<%@page import="Org_Car_Services.CarService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@  page import ="javax.servlet.http.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="CustomerDash.jsp"  %>
<body>


<% 

int ccid;
Custumer_model cm = null; // Initialize cm to null

if(session.getAttribute("ccid") != null) {
    ccid = Integer.parseInt(session.getAttribute("ccid").toString());
    CarService cs = new Customer_ServiceImp();
    cm = cs.getProfile(ccid);
}
%>

<%
// Check if cm is not null before accessing its methods
if(cm != null) {
%>
    <input type="text" name="name" value="<%= cm.getName() %>" class="control"><br/><br/>
    <input type="text" name="email" value="<%= cm.getEmail() %>" class="control"><br/><br/>
    <input type="text" name="contact" value="<%= cm.getContact() %>" class="control"/><br/><br>
    <input type="text" name="address" value="<%= cm.getAddress() %>" class="control"/><br/><br>
    <input type="submit" name="s" value="Update profile"/>
<%
} else {
    // Handle the case where cm is null, for example:
%>
    <p>No profile found for the current session.</p>
<%
}
%>



</body>
</html>