<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b_update</title>
</head>
<body>
<h3>게시판 글을 수정합니다 'ㅅ' </h3>
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
		
		//게시글을 출력해서 수정 하기 위한 sql문장
		pstmt = conn.prepareStatement("select * from board where bno=?");
		pstmt.setInt(1,bno);

		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeQuery() : select(select된 결과를 ResultSet에 저장해서 반환)
		rs = pstmt.executeQuery();
		
		if(rs.next()){
 %>

		<form action="b_updateserver.jsp">
		<table border="1">
			<tr>
				<td>글번호</td>
				<td><input  type="hidden" name="bno" value="<%=rs.getInt("bno")%>"></td>
			</tr>		
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" value="<%=rs.getString("title")%>"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="30" name="content"><%=rs.getString("content")%></textarea></td>
			</tr>
			<tr >
				<td colspan = "2">
				<input type="submit" value="수정 하기">
				<a href="b_list.jsp"><input type="button" value="글 목록"></a></td>
			</tr>
		</table>
		</form>
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
</body>
</html>