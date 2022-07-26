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
<h3> 회원목록 리스트 'ㅅ' </h3>
<table border="1">
	<tr>
		<td>아이디</td><td>주소</td><td>이메일</td><td>이름</td>
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
		
		//회원목록을 출력 하기 위한 sql문장
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("select * from member");
		
		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeQuery() : select(select된 결과를 ResultSet에 저장해서 반환)
		//executeUpdate() : insert, update, delete
		rs = pstmt.executeQuery();	//ResultSet에 결과 들어가있음
		
		while(rs.next()){ 
%>						
	<tr>
		<td><%=rs.getString("id") %></td>
		<td><%=rs.getString("addr") %></td>
		<td><%=rs.getString("email") %></td>
		<td><%=rs.getString("name") %></td>
	</tr>			
			
<%
		}				

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