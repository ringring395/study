<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22list</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style type="text/css">
table{margin-right:auto; margin-left:auto; 
font-family: 'Jua', sans-serif; }
input {font-size:30px; }
h1 {font-family: 'Jua', sans-serif; }
h1, td, div {text-align:center; }
button {font-size:30px;
background-color:#B0E0E6; border:none; font-family: 'Jua', sans-serif;}
th {font-size:20px; background-color:#B0E0E6; 
font-family: 'Jua', sans-serif; font-weight:lighter}
tr:nth-child(2n+1){background-color:#F0F8FF}
</style>

</head>
<body>
<h1>🐬게시글 목록 리스트🐬</h1>
<table border="1">
	<tr>
		<th>글번호</th><th>글쓴이</th><th style="width:200px">글제목</th>
	</tr>
<%

	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//게시판 목록을 출력 하기 위한 sql문장
		pstmt = conn.prepareStatement("select * from board join member on board.id = member.id order by bno");
		//select문에 진행
		rs = pstmt.executeQuery();	//ResultSet에 결과 들어가있음
					
			while(rs.next()){ 
%>
	
			<tr>
				<td><%=rs.getInt("bno") %></td>
				<td><%=rs.getString("name") %></td>
				<td><a href="22content.jsp?bno=<%=rs.getInt("bno")%>"><%=rs.getString("title") %></a></td>
			</tr>
	
<%
			}//while닫음
			
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		conn.close();
		rs.close();
		pstmt.close();
	}		
%>
</table>
	<div>
	<a href="22write.jsp"><button>글쓰기</button></a></div>
</body>
</html>