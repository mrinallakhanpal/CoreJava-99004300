<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
a:link, a:visited {
  background-color: black;
  color: skyblue;
  border: 4px solid skyblue;
  padding: 20px 40px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: white;
  color: black;
}
</style>


</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<center><a href="insertproduction.html">Insert Production Details</a></center><br>
<center><a href="insertmovie.html">Insert Movie Details</a></center><br>
<center><a href="viewproduction.jsp">View Production Table</a></center><br>
<center><a href="viewmovie.jsp">View Movie Table</a></center><br>
<form action="./logoutServlet">
<center><a href="default.html">Logout</a></center><br>
<jsp:include page="footer.jsp"></jsp:include>
</form>
</body>
</html>