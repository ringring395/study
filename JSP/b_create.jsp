<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기 페이지</title>
</head>
<body>
<h3>게시판 글쓰기 'ㅅ' </h3>
<form action="b_createserver.jsp">
<table border="1">
	<tr>
		<td>제목</td>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea rows="10" cols="50" name="content"></textarea></td>
	</tr>
	<tr >
		<td colspan = "2"><input type="submit" value="글 등록">
		<a href="b_list.jsp"><input type="button" value="글 목록"></a></td>
	</tr>	
</table>
</form>
</body>
</html>