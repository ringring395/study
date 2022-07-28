<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b_createserver</title>
<%
	//한글 깨짐 방지 설정(form 태그의 method가 post일때)
	request.setCharacterEncoding("UTF-8");
	//데이터 수집
	//사용자가 입력한 제목을 title변수에 저장
	String title = request.getParameter("title");
	//사용자가 입력한 내용을 content변수에 저장
	String content = request.getParameter("content");
	//login 데이터 수집(형변환)
	String id =	(String)session.getAttribute("id");	//로그인할때 사용자가 입력한 id를 가져옴.
%>
</head>
<body>
<h3>글쓰기 연결 'ㅅ' </h3>
<%
	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();

		//글작성 하기 위한 sql문장
		//preparedstatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("insert into board(title, content, id) values(?,?,?)");
		//첫번째 물음표에는 사용자가 입력한 제목(request.getParameter("title"))을 설정
		pstmt.setString(1,title);
		//두번째 물음표에는 사용자가 입력한 내용(request.getParameter("content"))을 설정
		pstmt.setString(2,content);
		//세번째 물음표에는 사용자가 입력한 내용(request.getParameter("id"))을 설정
		pstmt.setString(3,id);
		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeUpdate() : insert, update, delete
		int result = pstmt.executeUpdate();	//insert되면 1, 안되면 0
		
		if(id != null){ //id값이 null이 아니면
			if(result == 1){//insert되었으면(=글작성 완료 되었으면)
				//바로 게시판 목록리스트로 이동
				out.println("<script>");
				out.println("location.href='b_list.jsp'");
				out.println("</script>");			
			}else {			//그렇지 않으면
				session.setAttribute("id",id);
				//글쓰기 화면으로 이동
				out.println("<script>");
				out.println("location.href='b_create.jsp'");
				out.println("</script>");			
			}
		}else {//id값이 null이면
			//main.jsp로 이동
			out.println("<script>");
			out.println("location.href='main.jsp'");
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