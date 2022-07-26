<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 글을 수정합니다 'ㅅ' </h3>
<form action="b_updateserver.jsp">
<table>
	<tr>
		<td>제목</td>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea rows="30" cols="50" name="content"></textarea></td>
	</tr>
	<tr >
		<td colspan = "2"><input type="submit" value="글 수정 등록"></td>
	</tr>
</table>
</form>
</body>
</html>