/**
 * 29일 jQuery 연습문제 5번
 */
//5번. 실제 로그인 화면에 적용하는 유효성 검사를 완성하시오.
/*hint) <form>
 * 			아이디
 * 			비밀번호
 * 		</form>로 설정한 후 onsubmit이벤트 검색
 */
 $(document).ready(function(){
 //form 값을 서버로 submit했을때,
 $("form").on("submit",function(){
//	 event.preventDefault();
		//아이디 입력 여부 체크 
		if($("#5id").val() == ""){
			$("#idp").html("id를 입력하세요.").css("color","red");
			return false; //서버로 id값을 보내지 마라
		//비번 입력 여부 체크
		}else if($("#5pw").val() == ""){
			$("#pwp").html("비밀번호를 입력하세요.").css("color","red");
			return false; //서버로 비번값을 보내지 마라
		}
 }) //submit이벤트 닫음.
 
 
 })//$(document).ready 종료.