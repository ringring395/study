<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22writeserver</title>
<%
	//사용자가 입력한 title값을 title변수에 저장
	String title = request.getParameter("title");
	//사용자가 입력한 content값을 content변수에 저장
	String content = request.getParameter("content");
	//세션에 저장된 id 수집
	String id = (String)session.getAttribute("id");
%>
</head>
<body>
글쓰기
<%
	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//글 쓰기를 하기 위한 sql문장
		pstmt = conn.prepareStatement("insert into board (title, content, id) values(?,?,?)");
		//첫번째 물음표에는 사용자가 입력한 title값(request.getParameter("title"))을 설정
		pstmt.setString(1,title);
		//두번째 물음표에는 사용자가 입력한 content값(request.getParameter("content"))을 설정
		pstmt.setString(2,content);
		//세번째 물음표에는 session의 id값
		pstmt.setString(3,id);
		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeUpdate() : insert, update, delete
		int result = pstmt.executeUpdate();	//insert되면 1, 안되면 0
		
		if(result == 1){//insert되었으면(=회원가입 되었으면)
			//바로 글 목록화면으로 이동 22list.jsp
			out.println("<script>");
			out.println("location.href='22list.jsp'");
			out.println("</script>");
		}else {			//그렇지 않으면
			//글쓰기 화면으로 이동 22wirte.jsp
			out.println("<script>");
			out.println("location.href='22write.jsp'");
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