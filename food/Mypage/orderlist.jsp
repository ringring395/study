<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>orderlist</title>
<style type="text/css">
container {
	display: flex;
	justify-content: center;
}

div {
	margin: 5px;
}

header {
	text-align: center;
}
</style>
</head>
<body>
<header>
	<h1>food</h1>
	<p>다른 메뉴는 메인페이지 따라갈게요</p>
</header>

<container>
	<div id="side_left">
		<table border="1">
			<tr>
				<td colspan="2">주문, 배송 조회</td>
			</tr>
			<tr>
				<td rowspan="2">프로필사진</td>
				<td>회원 id 님</td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="회원정보 수정"></td>
			</tr>
			<tr>
				<td colspan="2">
					<ul>
						<li>공지사항</li>
						<li>자주하는 질문</li>
						<li>1:1 문의</li>
					</ul>
				</td>
			</tr>

		</table>
	</div>
	<div id="orderlist">

		<div>
			<label>주문날짜 8/1</label>
		</div>
		<div class="order1" style="border: 1px solid;">
			<table style="width: 500px;">
				<tr>
					<td rowspan="3">상품 사진</td>
					<td>상품 이름(제목)</td>
					<td><input type="button" value="상세 보기"></td>
				</tr>
				<tr>
					<td>외 2품목</td>
					<td><input type="button" value="배송 조회"></td>
				</tr>
				<tr>
					<td>금액 80,000</td>
					<td><input type="button" value="취소">
					<input type="button" value="반품"></td>
				</tr>
			</table>
		</div>
		<div>
			<label>주문날짜 7/25</label>
		</div>
		<div class="order1" style="border: 1px solid;">
			<table style="width: 500px;">
				<tr>
					<td rowspan="3">상품 사진</td>
					<td>상품 이름(제목)</td>
					<td><input type="button" value="상세 보기"></td>
				</tr>
				<tr>
					<td>외 5품목</td>
					<td><input type="button" value="배송 완료"></td>
				</tr>
				<tr>
					<td>금액 130,000</td>
					<td></td>
				</tr>
			</table>
		</div>
		<div>
			<label>주문날짜 7/13</label>
		</div>
		<div class="order1" style="border: 1px solid;">
			<table style="width: 500px;">
				<tr>
					<td rowspan="3">상품 사진</td>
					<td>상품 이름(제목)</td>
					<td><input type="button" value="상세 보기"></td>
				</tr>
				<tr>
					<td>외 1품목</td>
					<td><input type="button" value="배송 완료"></td>
				</tr>
				<tr>
					<td>금액 40,000</td>
					<td></td>
				</tr>
			</table>
		</div>		
	</div>
	<div id="go_watched" style="border: 1px solid;">
		<h3>최근 본 상품</h3>
		<div id="go_watched1"
			style="width: 130px; height: 100px; border: 1px solid;">상품1</div>
		<div id="go_watched2"
			style="width: 130px; height: 100px; border: 1px solid;">상품2</div>
		<div id="go_watched3"
			style="width: 130px; height: 100px; border: 1px solid;">상품3</div>
	</div>
</container>

<footer>
	<p>회사소개</p>
</footer>
</body>
</html>