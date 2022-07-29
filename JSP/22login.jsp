<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22login</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style type="text/css">
table{margin-right:auto; margin-left:auto; }
input {font-size:30px; font-family: 'Jua', sans-serif;}
button {font-size:30px; font-family: 'Jua', sans-serif;}
h1 {text-align:center; font-family: 'Jua', sans-serif;}
td {text-align:center; }
.color{background-color:#B0E0E6; border:none; }
</style>

</head>
<body>
<h1>🐬게시판 이용하기🐬</h1>
<form action="22loginserver.jsp">
<table>
	<tr><td><input type="text" placeholder="ID" name="id"></td></tr>
	<tr><td><input type="password" placeholder="PASSWORD" name="pw"></td></tr>
	<tr><td id="on">
		<input type="submit" value="로그인" class="color">
		<a href="22member.jsp"><button class="color">회원가입</button></a>
		</td>
	</tr>
</table>
</form>
</body>
</html>