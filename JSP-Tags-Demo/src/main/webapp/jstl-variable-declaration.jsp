<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="index" value="1234">
</c:set>

<c:out value="${index}"/>

<c:if test="${index == 1234}">
	<c:out value="The value of index is 1234"/>
</c:if>

</body>
</html>