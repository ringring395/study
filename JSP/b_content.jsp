<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판_상세페이지</title>
</head>
<body>
<h3>게시판 상세 내용 입니다 'ㅅ' </h3>
<table border="1">
	<tr>
		<td>글번호</td><td>글제목</td><td>글내용</td>
	</tr>

<%
	int bno = request.getIntHeader("bno");
	session.setAttribute("bno", bno);
	
	String title = request.getParameter("title");
	session.setAttribute("title", title);
	
	String content = request.getParameter("content");
	session.setAttribute("content", content);
	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//게시글을 출력 하기 위한 sql문장
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("select title=?, content=? from board where bno=?");
		pstmt.setString(1,"session.getAttribute('title')");
		pstmt.setString(2,"session.getAttribute('content')");
		pstmt.setString(1,"session.getAttribute('bno')");

		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeQuery() : select(select된 결과를 ResultSet에 저장해서 반환)
		rs = pstmt.executeQuery();
		
		while(rs.next()){
 %>				
			<tr>
				<td><%=rs.getInt("bno") %></td>
				<td><%=rs.getString("title") %></td>
				<td><%=rs.getString("content") %></td>
			</tr>						
<%		
		}//while 닫음
				
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