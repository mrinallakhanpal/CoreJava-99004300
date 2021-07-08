<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertp" method="post" style=" margin-top:40px">
		ProductionID:<input type="number" name=pid><br>
		<br> Production Name:<input type="text" name="pname"><br>
		<br> Address:<input type="text" name="add"><br>
		<br> Year of started:<input type="text" name="year"><br>
		<br> Owner Name:<input type="text" name="oname"><br>
		<br> <input type="submit" value="add production details">

	</form>
</body>
</html>