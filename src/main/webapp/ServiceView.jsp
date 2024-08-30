<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
     <%@page import="Org_Car_Services.CserviceServices,Org_Car_Services.CserviceImp_service,Car_Models.ServiceModel ,java.util.*" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 .submit-btn {
            width: 50%;
            height: 40px;
            background-color: #4CAF50;
            /* Changed button color */
            color: white;
            border: none;
            border-radius: 5px;
            /* Added border radius for a nicer look */
            cursor: pointer;
        }

        .submit-btn:hover {
            background-color: #45a049;
            /* Darker color on hover */
            
            }


</style>
</head>
<body>

<form  action="servview" method=" GET">
<h1>Service List</h1>
<br/><br/><br/>
<table>
<% String contact=request.getParameter("id"); %>
<%!  CserviceServices cs= new CserviceImp_service();%>

<%
 
    List<ServiceModel> list = cs.getAllservice();
    for (ServiceModel sm : list) {
%> 
    <tr>
    
        <td><input type="checkbox" name='stype' value='<%= sm.getSid() %>' />&nbsp;&nbsp;<%= sm.getName()%>&nbsp; &nbsp;&nbsp;<%=sm.getPrice()%></td>
        
    </tr>
    
<%
   }
%>
<tr>
	<input type="hidden" name='uid' value='<%= contact %>' />
    <td><input type="date" name='date' value='' ></td>
</tr>
</table>
<input class="submit-btn" type="submit" name="s" />
</form>
</body>
</html>