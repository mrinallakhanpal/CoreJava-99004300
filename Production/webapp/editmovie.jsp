<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.production.*,com.productiondao.*,java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<h1>Edit Movie Details</h1>
<%
MovieDao pd=new MovieDao();
int id=Integer.parseInt(request.getParameter("id"));
Movie p=pd.getPlayerbyId(id);
%>
<form action="./Updatemovie" method="post">
<input type="hidden" name="mid" value="<%=id %>"><br><br>
Movie Name<input type="text" name="mname" value="<%=p.getMovie_name()%>"><br><br>
Hero Name:<input type="text" name="mhname" value="<%=p.getHero_name()%>"><br><br>
Heroine Name:<input type="text" name="mhername" value="<%=p.getHeroine()%>"><br><br>
Release Date:<input type="text" name="dob" value="<%=p.get_date()%>"><br><br>
Language:<input type="text" name="lan" value="<%=p.getLanguage()%>"><br><br>
Length:<input type="text" name="len" value="<%=p.getLength()%>"><br><br>
Movie Type:<input type="text" name="mtype" value="<%=p.getMovie_type()%>"><br><br>
Production ID:<input type="text" name="pid" value="<%=p.getProduction_id()%>"><br><br>
<input type="submit" value="update movie"  class="btn btn-primary">
</form>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>