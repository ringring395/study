/**
 * 28일_jquery
 */
// $(선택자) 로 jQuery 호출.
//웹브라우저 선택한 것에 대해서 준비가 된 후,익명함수에 있는 것을 실행.
// ready는 함수.콜백함수.
$(document).ready(function(){
//	//id를 이용한 선택자
//	$("#header1").css({"color":"red","border-style":"dotted"})
//	$("#header2").css({"color":"white","background-color":"black","border-style":"dotted"})
//	$("#header3").css("color","yellow").css("background-color","blue")
//	$("#header4").css("color","skyblue").css("background-color","gray")
//	//class를 이용한 선택자
//	$(".header2").css("bordor-style","dashed")
//	//tag를 이용한 선택자
//	$("body").css("background-color","pink")
	//on이라는 함수호출(""이벤트를 하면 콜백함수를 진행)
	$("#header1").on("click",function(){
		alert("첫번째 h1태그를 클릭하셨습니다.");
	})
	$("#ini").on("blur",function(){
		alert("아이디 입력란에서 커서를 뺏겼을때")
	})
		
})

