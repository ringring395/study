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
<%
	//login.jsp에 있는 데이터 수집
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	System.out.println(id);
	System.out.println(pw);
	
	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//login을 하기 위한 sql문장
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("select * from member where id=? and pw=?");
		//첫번째 물음표에는 사용자가 입력한 id값(request.getParameter("id"))을 설정
		pstmt.setString(1,id);
		//두번째 물음표에는 사용자가 입력한 pw값(request.getParameter("pw"))을 설정
		pstmt.setString(2,pw);
		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeQuery() : select(select된 결과를 ResultSet에 저장해서 반환)
		//executeUpdate() : insert, update, delete
		rs = pstmt.executeQuery();
		
		if(rs.next()){ //resultset에 데이터가 있으면
			//login 해라
		}else {	//그렇지 않으면
			//login.jsp를 실행.
		}
		
		
		//System.out.println("DB연결 성공");
	}catch(Exception e){
		//System.out.println("DB연결 실패");
		e.printStackTrace();
	}
	
%>
</body>
</html>