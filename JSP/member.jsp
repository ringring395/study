<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 어서오세요 'ㅅ'</h3>
<form action="memberserver.jsp">
<table>
	<tr>
		<td>ID : </td>
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>PW : </td>
		<td><input type="password" name="pw"></td>
	</tr>
	<tr>
		<td>ADDR : </td>
		<td><input type="text" name="addr"></td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="회원가입">
		</td>
	</tr>		
</table>
</form>
</body>
</html>