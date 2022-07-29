<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22memberserver</title>
<%
	//사용자가 입력한 id값을 id변수에 저장
	String id = request.getParameter("id");
	//사용자가 입력한 pw값을 pw변수에 저장
	String pw = request.getParameter("pw");
	//사용자가 입력한 name값을 name변수에 저장
	String name = request.getParameter("name");
%>
</head>
<body>
회원가입 서버입니다.
<%
// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//회원가입을 하기 위한 sql문장
		pstmt = conn.prepareStatement("insert into member (id, pw, name) values(?,?,?)");
		//첫번째 물음표에는 사용자가 입력한 id값(request.getParameter("id"))을 설정
		pstmt.setString(1,id);
		//두번째 물음표에는 사용자가 입력한 pw값(request.getParameter("pw"))을 설정
		pstmt.setString(2,pw);
		//세번째 물음표에는 사용자가 입력한 name값(request.getParameter("name"))을 설정
		pstmt.setString(3,name);
		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeUpdate() : insert, update, delete
		int result = pstmt.executeUpdate();	//insert되면 1, 안되면 0
		
		if(result == 1){//insert되었으면(=회원가입 되었으면)
			//바로 로그인화면으로 이동
			out.println("<script>");
			out.println("location.href='22login.jsp'");
			out.println("</script>");			
		}else {			//그렇지 않으면
			//회원가입 화면으로 이동
			out.println("<script>");
			out.println("location.href='22member.jsp'");
			out.println("</script>");			
		}

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		conn.close();
		pstmt.close();
	}
%>
</body>
</html>