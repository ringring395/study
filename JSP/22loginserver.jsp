<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22loginserver</title>
</head>
<body>
로그인서버입니다.
<%
	//22login.jsp에 있는 데이터 수집
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
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
		rs = pstmt.executeQuery();
		
		if(rs.next()){ //resultset에 데이터가 있으면
			//login 해라 sesison
			//session영역에 id값을 유지시킴으로 로그인된 채로 서비스를 이용
			session.setAttribute("id", id);	//로그인된 채로
			//글쓰기로 이동 22write.jsp
			out.println("<script>");
			out.println("location.href='22write.jsp'");
			out.println("</script>");
		}else {	//그렇지 않으면
			//회원가입으로 이동 22member.jsp
			out.println("<script>");
			out.println("location.href='22member.jsp'");
			out.println("</script>");
		}
		
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