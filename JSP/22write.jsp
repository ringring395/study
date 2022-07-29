<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22write</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style type="text/css">
#home {background-color:#F0F8FF; width:30px; font-size:25px; 
float:right}
table{margin-right:auto; margin-left:auto; font-family: 'Jua', sans-serif;
background-color:#F0F8FF; }
h1{text-align:center; font-family: 'Jua', sans-serif;}
input {font-family: 'Jua', sans-serif;}
#cen {text-align:center;}
.color{background-color:#B0E0E6; border:none; font-size:30px;}
</style>

</head>
<body>
<div id="home"><a href="22logout.jsp">🏠</a></div>
<h1>🐬글쓰기🐬</h1>
<form action="22writeserver.jsp">
<table>
	<tr>
		<td>제목 : </td>
		<td><input type="text" name="title" style="width:450px"></td>
	</tr>
	<tr>
		<td>내용 : </td>
		<td><textarea rows="15" name="content" style="width:450px"></textarea></td>
	</tr>
	<tr id="cen">
		<td colspan="2"><input type="submit" value="글쓰기" class="color">
		<a href="22list.jsp">
			<input type="button" value="목록으로" class="color"></a></td>
	</tr>	
</table>
</form>
</body>
</html>