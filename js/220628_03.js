/**
 * 28일 jquery 적용
 */
$(document).ready(function(){

	//아이디 : 5~20자의 영문소문자, 숫자와 특수기호(_), (-)만 사용 가능합니다.
 $("#ini").on("keyup",function(){
	var pattern1=/^[a-z]+[a-z0-9\-\_]{4,19}$/g; 
	if(pattern1.test($("#ini").val())){
		$("#si").html("올바른 id 형식입니다.").css("color","green");
	}else{
		$("#si").html("올바르지 않은 id형식입니다.").css("color","red");
	}
 })

 	//비밀번호 : 8~16자 영문 대소문자, 숫자, 특수문자를 사용하세요.
 $("#inp").on("keyup",function(){
	var pattern2=/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#?!@$%^&*-])[\w#?!@$%^&*-]{8,16}$/g;
	if(pattern2.test($("#inp").val())){
		$("#sp").html("올바른 비밀번호 형식입니다.").css("color","green");
	}else{
		$("#sp").html("올바르지 않은 비밀번호 형식입니다.").css("color","red");	
	} 
 })

 	//비번 재입력 :비밀번호값이랑 재입력 값이랑 비교
 $("#inp2").on("blur",function(){
	 if($("#inp2").val() == $("#inp").val()){
		 $("#sp2").html("두 비밀번호가 일치합니다.").css("color","green")
	 }else{
		 $("#sp2").html("비밀번호를 다시 확인해주세요.").css("color","red")
	 }
 })
	//이메일주소 : 이메일주소를 다시 확인해주세요.(@ 필수)
 $("#ine").on("keyup",function(){
	var pattern3=/^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/g;
	if(pattern3.test($("#ine").val())){
		$("#se").html("올바른 이메일 형식입니다.").css("color","green");
	}else{
		$("#se").html("올바르지 않은 이메일 형식입니다.").css("color","red");
	}
 })
 
})
