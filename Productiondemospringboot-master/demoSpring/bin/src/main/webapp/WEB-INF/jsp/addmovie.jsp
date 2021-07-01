<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertmovie" method="post">

Movie Name:<input type="text" name="mname"><br><br>
Movie Cast1 (Hero Name)<input type="text" name="cast1"><br><br>
Movie Cast2 (Heroine Name)<input type="text" name="cast2"><br><br>

Movie Type: <select name="mtype">
<option value="Drama">Drama</option>
<option value="Commertial">Commertial</option>
<option value="Thriller">Thriller</option>
<option value="Suspence Thriller">Suspence Thriller</option>
<option value="Romance">Romance</option>

</select><br><br>

Release Date: <input type="date" name="mdate"><br><br>

<input type="submit" value="Add Movies">

</form>
</body>
</html>