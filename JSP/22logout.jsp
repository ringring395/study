<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
로그아웃되면서 홈으로 돌아감
<%
	session.invalidate();
	out.println("<script>");
	out.println("location.href='22login.jsp'");
	out.println("</script>");	
	
%>
</body>
</html>