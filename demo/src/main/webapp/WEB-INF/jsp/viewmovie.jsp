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
<body style="text-align:center">
<table>
<tr>
<th>MovieId</th>
<th>MovieName</th>
<th>HeroName</th>
<th>HeroineName</th>
<th>ReleasedDate</th>
<th>MovieLanguage</th>
<th>MovieType</th>
<th>MovieLength</th>
<th>ProductionId</th>
<th>edit</th>
</tr>

<c:forEach items="${movie}" var="m">
<tr>
<td><c:out value="${m.getMovieid()}"></c:out></td>
<td><c:out value="${m.getMoviename()}"></c:out></td>
<td><c:out value="${m.getHero()}"></c:out></td>
<td><c:out value="${m.getHeroine()}"></c:out></td>
<td><c:out value="${m.getDate()}"></c:out></td>
<td><c:out value="${m.getLang()}"></c:out></td>
<td><c:out value="${m.getType()}"></c:out></td>
<td><c:out value="${m.getLength()}"></c:out></td>
<td><c:out value="${m.getProdid()}"></c:out></td>
 <td><a href="editmovie?id=<c:out value="${m.getMovieid()}"></c:out>">Edit</a></td>
</c:forEach>
</table>
<br><br>
<a href="/">Home</a>
</body>
</html>