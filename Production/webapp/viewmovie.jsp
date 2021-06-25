<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="com.production.*,com.productiondao.*,java.util.*" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Details</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<%
MovieDao pd=new MovieDao();
List<Movie>p=pd.getAllDetails();
%>
<table  class="table table-striped">
<tr>
<td><h4>Movie ID</h4></td>
<td><h4>Movie Name</h4></td>
<td><h4>Hero Name</h4></td>
<td><h4>Heroine Name</h4></td>
<td><h4>Release Date</h4></td>
<td><h4>Language</h4></td>
<td><h4>Length</h4></td>
<td><h4>Movie Type</h4></td>
<td><h4>Production ID</h4></td>
<td><h4>Update</h4></td>
</tr>

<%
for(Movie pi:p)
{
%>
<tr>
<td><%=pi.getMovie_id() %></td>
<td><%=pi.getMovie_name()%></td>
<td><%=pi.getHero_name() %></td>
<td><%=pi.getHeroine() %></td>
<td><%=pi.get_date() %></td>
<td><%=pi.getLanguage() %></td>
<td><%=pi.getLength() %></td>
<td><%=pi.getMovie_type() %></td>
<td><%=pi.getProduction_id() %></td>
<td><a href="editmovie.jsp?id=<%=pi.getMovie_id()%>">Edit</a></td>
</tr>
<%} %>
</table>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>