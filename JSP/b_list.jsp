<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판_리스트</title>
</head>
<body>
<h3> 게시판 목록 리스트 'ㅅ' </h3>
<a href="logoutserver.jsp"><button>로그아웃</button></a>
<table border="1">
	<tr >
		<td>No.</td><td>제목</td><td>작성일자</td><td>조회수</td><td>글쓴이id</td>
	</tr>
<%
	//login 데이터 수집(형변환)
	String id = (String)session.getAttribute("id");

	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//게시판 목록을 출력 하기 위한 sql문장
		pstmt = conn.prepareStatement("select * from board");
		//select문에 진행
		rs = pstmt.executeQuery();	//ResultSet에 결과 들어가있음
				
		if(	id != null ){//id가 null값이 아니라면

			while(rs.next()){ 
%>

			<tr>
				<td><%=rs.getInt("bno") %></td>
				<td><a href="b_content.jsp?bno=<%=rs.getInt("bno")%>"><%=rs.getString("title") %></a></td>
				<td><%=rs.getString("regdate") %></td>
				<td><%=rs.getInt("count") %></td>
				<td><%=rs.getString("id") %></td>
			</tr>
	
<%
			}//while닫음
			
		}else{//id가 null이면
			//login.jsp로 이동
			out.println("<script>");
			out.println("location.href='login.jsp'");
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
</table>
	<a href="b_create.jsp"><input type="button" value="글쓰기"></a>
</body>
</html>