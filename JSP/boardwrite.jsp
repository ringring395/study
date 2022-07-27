<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardwrite</title>
</head>
<body>
<h3>글쓰기 ㅎㅅㅎ </h3>
<form action="boardwriteserver.jsp">
<table border="1">
	<tr>
		<td>제목</td><td><input type="text" name="title"></td>
	</tr>
	<tr>
		<td>내용</td><td><textarea rows="10" cols="30" name="content" ></textarea></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="글 쓰기"></td>
	</tr>
</table>
</form>
</body>
</html>