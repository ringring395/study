<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22member</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style type="text/css">
h1 {text-align:center; font-family: 'Jua', sans-serif;}
table{margin-right:auto; margin-left:auto; }
input {font-size:30px; font-family: 'Jua', sans-serif;}
#color{background-color:#B0E0E6; border:none;}
</style>
<script type="text/javascript" src="js/22member.js"></script>
</head>
<body>
<h1>🐬회원가입🐬</h1>
<form action="22memberserver.jsp">
<table>
	<tr><td><input type="text" placeholder="ID" name="id" id="id"></td></tr>
	<tr><td><input type="text" placeholder="PASSWORD" name="pw" id="pw"></td></tr>
	<tr><td><input type="text" placeholder="NAME" name="name" id="na"></td></tr>
	<tr><td><input type="submit" value="가입하기" id="color"></td>
	</tr>
</table>
</form>
</body>
</html>