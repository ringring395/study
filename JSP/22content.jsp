<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.sql.*" %> 
<%@ page import="javax.naming.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22content</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style type="text/css">
table{margin-right:auto; margin-left:auto; font-family: 'Jua', sans-serif;
background-color:#F0F8FF;}
.in2 {font-size:30px; background-color:#B0E0E6; border:none; 
font-family: 'Jua', sans-serif;}
h1, div {text-align:center; font-family: 'Jua', sans-serif;}
th {font-size:15px; background-color:#B0E0E6; }
</style>

</head>
<body>
<h1>🐬상세 내용 보기🐬</h1>
<%
	//bno 수집 (22list.jsp의 a태그에서 보낸 부분)
	int bno = Integer.parseInt(request.getParameter("bno"));
	
	//id수집
	String id =	(String)session.getAttribute("id");
	
	// DB연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		//게시물 상세보기 위한 sql문장
		pstmt = conn.prepareStatement("select * from board join member on board.id = member.id where bno=?");
		//setString이 아니라 int bno에 맞게 setInt로 진행
		pstmt.setInt(1,bno);

		//위 sql문장을 실행(workbench : ctrl+enter)
		//executeQuery() : select(select된 결과를 ResultSet에 저장해서 반환)
		rs = pstmt.executeQuery();
		
		if(rs.next()){

 %>	
<form action="22update.jsp">
<table>
	<tr><input  type="hidden" name="bno" value="<%=rs.getInt("bno")%>">
		<td>제목 : </td>
		<td ><input type="text" name="title" style="width:450px"
		value="<%=rs.getString("title")%>">
		</td>
	</tr>
	<tr>
		<td>글쓴이 : </td>
		<td><input readonly type="text" style="width:450px"
		value="<%=rs.getString("name")%>"></td>
	</tr>
	<tr>
		<td>내용 : </td>
		<td><textarea rows="15" style="width:450px" name="content"><%=rs.getString("content")%></textarea></td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center">
			<input type="submit" value="수정하기" class="in2">
			<a href="22delete.jsp?bno=<%=rs.getInt("bno")%>">
				<input type="button" value="삭제하기"  class="in2"></a>
			<a href="22list.jsp">
				<input type="button" value="목록으로"  class="in2"></a>
		</td>
	</tr>	
</table>
</form>
<%		
		}//if 닫음				
	
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