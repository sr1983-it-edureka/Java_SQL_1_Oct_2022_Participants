<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%

	if (session.getAttribute("invalid-user") != null && 
		session.getAttribute("invalid-user").equals("true")){
		
		response.sendRedirect("login.jsp");
	}else{
		
		out.println("Welcome user");
		out.println(session.getAttribute("username"));
	}
%>

<form action="logout">
	<input type="submit" value="Logout"></input>
</form>

</body>
</html>