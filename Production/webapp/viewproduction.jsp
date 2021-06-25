<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.production.*,com.productiondao.*,java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Production Details</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<%
ProductionDao pd=new ProductionDao();
System.out.println("mrinal!!");

List<Production>p=pd.getAlldetails();
System.out.println("mrinal!!");
%>
<table class="table table-striped">
<tr>
<td><h4>Production ID</h4></td>
<td><h4>Production Name</h4></td>
<td><h4>Address</h4></td>
<td><h4>Date Of Started</h4></td>
<td><h4>Owner Name</h4></td>
<td><h4>Update</h4></td>
</tr>

<%
for(Production pi:p)
{
%>
<tr>
<td><%=pi.getProductionid() %></td>
<td><%=pi.getProductionname()%></td>
<td><%=pi.getAdress() %></td>
<td><%=pi.getDateofStarted() %></td>
<td><%=pi.getOwnername() %></td>
<td><a href="editproduction.jsp?id=<%=pi.getProductionid()%>">Edit</a></td>
</tr>
<%
}
%>
</table>


<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>