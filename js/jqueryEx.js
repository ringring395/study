/**
 * 
 */
// 웹브라우저 선택한 것에 대해서 준비가 된 후 익명함수에 있는 것을 실행
$(document).ready(function(){
	// id를 이용한 선택자(글자색을 빨간색)
	//$("#header1").css("color","red")
	// id를 이용한 선택자(글자색을 빨간색이고, 배경색을 파란색으로 적용)
	// $("#header1").css("color","red").css("border-style","solid")
	//$("#header1").css({"color":"red","border-style":"solid"})
	
	// class를 이용한 선택자
	//$(".header1").css("background-color","yellow")
	// tag를 이용한 선택자
	//$("h1").css("font-size","20px")
	
	//$("#header1").on("click",function(){
	//	alert("첫번째 h1태그를 클릭했을 때");
	//})
	
	$("#idchk").on("blur",function(){
		// 아이디 관련 정규식을 만들자(5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다)
		var idreg = /^[a-z]+[a-z0-9-_]{5,20}$/g;
		
		// 아이디 정규식(regexp)이 입력한 id값(id.value)과 일치(test)하면
		if(idreg.test($("#idchk").val())){
			$("#idmsg").html("id로 사용하셔도 됩니다.").css("color","green");
		}else{// 그렇지 않으면
			$("#idmsg").html("id로 사용하시면 안됩니다.").css("color","red");
		}
	})
	
	$("#pwchk").on("blur",function(){
		// 아이디 관련 정규식을 만들자(5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다)
		var pwreg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,16}$/;
		
		// 아이디 정규식(regexp)이 입력한 id값(id.value)과 일치(test)하면
		if(pwreg.test($("#pwchk").val())){
			$("#pwmsg").html("id로 사용하셔도 됩니다.").css("color","green");
		}else{// 그렇지 않으면
			$("#pwmsg").html("id로 사용하시면 안됩니다.").css("color","red");
		}
	})
	$("#mailchk").on("blur",function(){
		// 아이디 관련 정규식을 만들자(5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다)
		var mailreg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		
		// 아이디 정규식(regexp)이 입력한 id값(id.value)과 일치(test)하면
		if(mailreg.test($("#mailchk").val())){
			$("#mailmsg").html("email로 사용하셔도 됩니다.").css("color","green");
		}else{// 그렇지 않으면
			$("#mailmsg").html("email로 사용하시면 안됩니다.").css("color","red");
		}
	})
})
	






