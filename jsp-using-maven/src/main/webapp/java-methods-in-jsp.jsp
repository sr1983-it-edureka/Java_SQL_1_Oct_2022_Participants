<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	int add(int a, int b){
		return a+b;
	}

	int sub(int a, int b){
		return a-b;
	}
%>

<%!
	int useAddAndSub(int a, int b){	
		
		int c = add(a, b);
		int d = sub(a, b);
		return c*d;
}
%>

<%
	int outcome = useAddAndSub(30, 40);
	out.println("Outcome is " + outcome);
%>

<%=outcome%>

</body>
</html>