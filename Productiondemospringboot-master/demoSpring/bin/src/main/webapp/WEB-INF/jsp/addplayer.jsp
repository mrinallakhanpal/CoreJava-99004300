<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertPlayer" method="post">
Player Number: <input type="text" name="pno"><br><br>
Player Name:<input type="text" name="pname"><br><br>
Team Number: <select name="tno">
<option value="1">Royal Challengers Bangalore</option>
<option value="2">Mumbai Indians</option>
<option value="3">Chennai super kings</option>

</select><br><br>

Mobile: <input type="number" name="mobile"><br><br>
Total runs: <input type="number" name="runs"><br><br>
<input type="submit" value="Add Player">

</form>
</body>
</html>