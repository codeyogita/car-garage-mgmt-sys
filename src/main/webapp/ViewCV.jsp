<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Org_Car_Services.*, java.util.*, Car_Models.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Details</title>
</head>
<style>
.t1 {
    width: 80%;
    height: 300px; /* Fixed typo */
    margin-left: 270px;
    margin-top: -570px;
    position: absolute;
    background-color: white;
}
</style>
<body>
    <%! CarService cService = new Customer_ServiceImp(); %>

    <%@include file="DashBord.jsp"%>
    <div class="t1">

        <h1>Customer Details</h1>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">sr</th>
                    <th scope="col">Customer Name</th>
                    <th scope="col">Mail</th>
                    <th scope="col">Contact</th>
                    <th scope="col">Vehicle Name</th>
                    <th scope="col">VehNum</th>
                    <th scope="col">Model</th>
                    <th scope="col">Delete</th>
                    <th scope="col">Update</th>
                    <th scope="col">Service</th>
                </tr>
            </thead>
            <tbody>
                <%
                try {
                    List<Object[]> CstDatalist = cService.getAllCustomerData();
                    int count = 0;
                    if (CstDatalist != null) {
                        for (Object[] obj : CstDatalist) {
                            count++;
                %>
                <tr>
                    <th scope="row"><%=count%></th>
                    <td><%=obj[0]%></td>
                    <td><%=obj[1]%></td>
                    <td><%=obj[2]%></td>
                    <td><%=obj[3]%></td>
                    <td><%=obj[4]%></td>
                    <td><%=obj[5]%></td>
                    <td><a href="deleteCont?id=<%=obj[2] %>&vid=<%=obj[4]%>">Delete</a></td>
                    <td><a href="Updatepage.jsp?id=<%=obj[2]%>&vid=<%=obj[4]%>&name=<%=obj[0]%>&email=<%=obj[1]%>&Contact=<%=obj[2]%>&comname=<%=obj[3]%>&vnum=<%=obj[4]%>&Model=<%=obj[5]%>">UPDATE</a></td>
                    <td><a href="ServiceView.jsp?id=<%=obj[2]%>">Service</a></td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <th scope="row"><%=++count%></th>
                    <td colspan="9">No customer data available.</td>
                </tr>
                <%
                    }
                } catch (Exception e) {
                    out.println("Error retrieving customer data: " + e.getMessage());
                }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
