<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판_상세 페이지</title>
</head>
<body>
<h3>게시판 상세 내용 입니다 'ㅅ' </h3>

<%
	//bno 수집
	int bno = Integer.parseInt(request.getParameter("bno"));
	
	//id수집
	String id =	(String)session.getAttribute("id");
	
	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//게시글을 출력 하기 위한 sql문장
		pstmt = conn.prepareStatement("select * from board where bno=?");
		pstmt.setInt(1,bno);

		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeQuery() : select(select된 결과를 ResultSet에 저장해서 반환)
		rs = pstmt.executeQuery();
		
		if(rs.next()){

 %>	
 <table border="1">
		<tr>
			<td>글번호</td><td>글제목</td><td>글내용</td>
			<td>작성일자</td><td>조회수</td><td>작성자 id</td>
		</tr>
 
		<tr>
			<td><%=rs.getInt("bno") %></td>		
			<td><%=rs.getString("title") %></td>
			<td><%=rs.getString("content") %></td>
			<td><%=rs.getDate("regdate") %></td>
			<td><%=rs.getInt("count") %></td>
			<td><%=rs.getString("id") %></td>
		</tr>

<%		
		}//if 닫음				
	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		conn.close();
		rs.close();
		pstmt.close();
	}
	
%>	
</table>
		<a href="b_update.jsp"><input type="button" value="수정"></a>
		<a href="b_delete.jsp"><input type="button" value="삭제"></a>
		<a href="b_list.jsp"><input type="button" value="목록"></a>

</body>
</html>