<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 삭제</title>
<%
	//id 값 수집
	String id = (String)session.getAttribute("id");

%>
</head>
<body>
<h3>게시물을 삭제합니다. ㅠㅅㅠ </h3>
<%
	
	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//게시글 삭제 하기 위한 sql문장
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("delete from board where bno=?");
		//첫번째 물음표에는 bno값 
		pstmt.setInt(1,((int)session.getAttribute("bno")));

		//위 sql문장을 실행(workbench : ctrl+enter)
		int result = pstmt.executeUpdate();	//delete되면 1, 안되면 0
		//게시글bno의 작성자와 현재로그인된 id가 같으면

		if(result == 1){//delete되었으면(=글 삭제 되었으면)
			//바로 게시물 리스트 화면으로 이동
			out.println("<script>");
			out.println("location.href='b_list.jsp'");
			out.println("</script>");			
		}else {			//그렇지 않으면
			//상세페이지 화면으로 이동
			out.println("<script>");
			out.println("location.href='b_content.jsp'");
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