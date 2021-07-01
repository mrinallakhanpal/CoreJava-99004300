<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View Details</h1>

<table border="1">
<tr>
<td>ProductionID</td>
<td>Production Name</td>
<td>Address</td>
<td>Year</td>
<td>Ownername</td>
</tr>
<c:forEach items="${list}" var="m">
<tr>
<td><c:out value="${m.ProductionID()}"></c:out></td>
<td><c:out value="${m.getProductionName()} "></c:out></td>
<td><c:out value="${m.getAddress() } "></c:out></td>
<td><c:out value="${m.getYear() } "></c:out></td>
<td><c:out value="${m.getOwnername() } "></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>