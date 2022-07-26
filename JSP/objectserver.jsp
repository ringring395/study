<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	//object.jsp의 이름 입력값을 요청함
	String name = request.getParameter("name");

	//request로 가져온 다음에 session에 저장함
	String id = request.getParameter("id");
							//String id
	session.setAttribute("id", id);

%>
</head>
<body>
<%=name %>
<%=session.getAttribute("id") %>
</body>
</html>