<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="b" method="post">
		MovieID:<input  name="mid" value="${movie. getMovieid()}"><br>
		<br> MovieName:<input  name="mname"
			value="${movie.getMoviename()}"><br> <br> Number
		of Tickets<input type="number" name="tno"><br>
		<br> ClassType:<select name="class">
			<option value="King">King</option>
			<option value="Queen">Queen</option>
		</select><br>
		<br> Date: <input type="date" name="date" value="yyyy-dd-mm " min="2021-07-01" max="2021-07-05"><br>
		<br> Show:<select name="show">
			<option value="Morning">Morning</option>
			<option value="Afternoon">Afternoon</option>
			<option value="Evening">Evening</option>
		</select><br><br>
		<input type="submit" value="book movie"><br><br>

	</form>
	<div style="text-align:center">
	<a href="/booking">Back</a><br><br>
	</div>
</body>
</html>