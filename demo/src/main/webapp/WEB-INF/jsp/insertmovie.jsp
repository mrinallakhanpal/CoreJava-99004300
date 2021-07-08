<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post" style=" margin-top:40px">
		MovieID:<input type="number" name=mid><br>
		<br> MovieName Name:<input type="text" name="mname"><br>
		<br> Hero name:<input type="text" name="hname"><br>
		<br> Heroine name:<input type="text" name="hename"><br>
		<br> Release date:<input type="date" name="d"><br>
		<br> Language:<input type="text" name="lang"><br>
		<br> Length:<input type="number" name="len"><br>
		<br> Movie type:<select name="type">
		<option value="Drama">Drama</option>
		<option value="Comedy">Comedy</option>
		<option value="Thriller">Thriller</option>
		<option value="Horror">Horror</option>
		</select><br>
		<br> ProductionID:<input type="number" name="pid"><br>
		<br> <input type="submit" value="add movie details">
         
	</form>
</body>
</html>