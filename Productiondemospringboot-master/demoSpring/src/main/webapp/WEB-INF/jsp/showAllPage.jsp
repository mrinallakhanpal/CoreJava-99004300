<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/static/css/custom.css" rel="stylesheet">
</head>
<body>

	<div align="center">

		<form:form action="/student/form">
			<input type="submit" value="Form">
		</form:form>
	</div>
	<div align="center">
		<h2>Your Table Data</h2>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Phone</th>
				<th>City</th>
				<th>Update Record</th>
				<th>Delete Record</th>
			</tr>
			<c:forEach var="students" items="${students}">
				<tr>
					<td>${students.id}</td>
					<td>${students.name}</td>
					<td>${students.age}</td>
					<td>${students.phone}</td>
					<td>${students.city}</td>


					<td><a
						href="${pageContext.request.contextPath}/student/updateStudent?userid=${students.id}">Update</a></td>
					<td><a
						href="${pageContext.request.contextPath}/student/delete/${students.id}"
						onclick="if(!(confirm('Are you sure you want to delete this record'))) return false">Delete</a></td>
				</tr>


			</c:forEach>
		</table>


		<script type="text/javascript"  src="/static/js/custom.js"></script>




	</div>


</body>
</html>