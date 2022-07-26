<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 게시판 목록 리스트 'ㅅ' </h3>
<table border="1">
	<tr>
		<td>번호</td><td>제목</td><td>내용</td><td>작성일자</td><td>조회수</td><td>작성자id</td>
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
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("select * from board");
		
		rs = pstmt.executeQuery();	//ResultSet에 결과 들어가있음
		
		while(rs.next()){ 

%>

	<tr>
		<td><%=rs.getInt("bno") %></td>
		<td><a href="b_content.jsp"><%=rs.getString("title") %></a></td>
		<td><%=rs.getString("content") %></td>
		<td><%=rs.getDate("regdate") %></td>
		<td><%=rs.getInt("count") %></td>
		<td><%=rs.getString("id") %></td>
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
</body>
</html>