<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="insertticket" method="post">
<pre>
Movie Name 					<input type="text" name="bmname"><br>
Date Of Booking 				<input type="date" name="bdate"><br>
Type						<select name="btype">
<option value="1">Queen</option>
<option value="2">King</option>
</select><br>
Show Dates					<input type="date" name="sdate"><br>
Shows						<select name="bshows">
<option value="1">Morning</option>
<option value="2">Afternoon</option>
<option value="3">Evening</option>
<option value="4">Night</option>
</select><br>
Total No Of Tickets				<input type="text" name="noticket"><br>
<input type="submit" value="Submit">
</pre>
</form>
</body>
</html>