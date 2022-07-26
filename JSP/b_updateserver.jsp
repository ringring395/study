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
	//사용자가 입력한 제목을 title변수에 저장
	String title = request.getParameter("title");
	//사용자가 입력한 내용을 content변수에 저장
	String content = request.getParameter("content");
	String id = request.getParameter("id");
	session.setAttribute("id", id);
%>
</head>
<body>
게시판 내용을 업데이트 합니다.
<%
// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//게시물을 수정 하기 위한 sql문장
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("update board set title=?, content=? where bno=");
		//첫번째 물음표에는 사용자가 수정한 title값(request.getParameter("title"))을 설정
		pstmt.setString(1,title);
		//두번째 물음표에는 사용자가 입력한 content값(request.getParameter("content"))을 설정
		pstmt.setString(2,content);

		//위 sql문장을 실행
		//executeUpdate() : insert, update, delete
		int result = pstmt.executeUpdate();	//insert되면 1, 안되면 0
		
		if(result == 1){	//update되었으면(=게시물 수정 되었으면)
			//바로 게시판 전체 리스트로 이동
			out.println("<script>");
			out.println("location.href='b_list.jsp'");
			out.println("</script>");			
		}else {			//그렇지 않으면
			//게시물 글수정에 다시 이동
			out.println("<script>");
			out.println("location.href='b_update.jsp'");
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