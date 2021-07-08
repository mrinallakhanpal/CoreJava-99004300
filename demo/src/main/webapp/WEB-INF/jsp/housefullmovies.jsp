<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  width:1000px;
  text-align:center;
}
</style>
</head>
</head>
<body style=" text-align:center">
<table>
<tr>

<th>MovieName</th>
<th>Date</th>
<th>Show</th>
</tr>
<c:forEach items="${movie}" var="m">
<tr>
<td><c:out value="${m.getMoviename()}"></c:out></td>
<td><c:out value="${m.getD()}"></c:out></td>
<td><c:out value="${m.getShowtype()}"></c:out></td>
</tr>
</c:forEach>
</table>
<div style="text-align:center">
<br><br>
<a href="/booking">Book More Movies</a><br><br>
<a href="/">Exit</a>
</div>
</body>
</html>