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
</head>
<body>
<h2>Ticket is booked successfully....</h2>
<h3>Price :
<c:forEach items="${price}" var="p">

<c:out value="${p.getMovieid()}"></c:out>

</c:forEach>
</h3>
<a href="/booking">Book more Movies</a><br><br>
<a href="/">Exit</a>
</body>
</html>