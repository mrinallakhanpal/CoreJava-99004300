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

<h1>Edit Production Details</h1>
<%
ProductionDao pd=new ProductionDao();
int id=Integer.parseInt(request.getParameter("id"));
Production p=pd.getPlayerbyId(id);
%>
<form action="./Updateproduction" method="post">
<input type="hidden" name="pid" value="<%=id %>"><br><br>
Production Name :<input type="text" name="pname" value="<%=p.getProductionname()%>"><br><br>
Address:<input type="text" name="address" value="<%=p.getAdress()%>"><br><br>
Date of Started:<input type="text" name="dob" value="<%=p.getDateofStarted()%>"><br><br>
Owner Name:<input type="text" name="oname" value="<%=p.getOwnername()%>"><br><br>
<input type="submit" value="update production"  class="btn btn-primary">
</form>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>