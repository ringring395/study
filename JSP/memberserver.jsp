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
<%
	//사용자가 입력한 id값을 id변수에 저장
	String id = request.getParameter("id");
	//사용자가 입력한 pw값을 pw변수에 저장
	String pw = request.getParameter("pw");
	//사용자가 입력한 addr값을 addr변수에 저장
	String addr = request.getParameter("addr");
%>
</head>
<body>
<%
// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//회원가입을 하기 위한 sql문장
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("insert into member (id, pw, addr) values(?,?,?)");
		//첫번째 물음표에는 사용자가 입력한 id값(request.getParameter("id"))을 설정
		pstmt.setString(1,id);
		//두번째 물음표에는 사용자가 입력한 pw값(request.getParameter("pw"))을 설정
		pstmt.setString(2,pw);
		//세번째 물음표에는 사용자가 입력한 pw값(request.getParameter("addr"))을 설정
		pstmt.setString(3,addr);
		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeQuery() : select(select된 결과를 ResultSet에 저장해서 반환)
		//executeUpdate() : insert, update, delete
		int result = pstmt.executeUpdate();	//insert되면 1, 안되면 0
		
		if(result == 1){//insert되었으면(=회원가입 되었으면)
			//바로 로그인화면으로 이동
			out.println("<script>");
			out.println("location.href='login.jsp'");
			out.println("</script>");			
		}else {			//그렇지 않으면
			//회원가입 화면으로 이동
			out.println("<script>");
			out.println("location.href='member.jsp'");
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