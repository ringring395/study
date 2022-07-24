/**
 * 27일 정규식 학습
 */
//window.onload : 웹브라우저 실행되자 마자
window.onload=function(){
//아이디 : 5~20자의 영문소문자, 숫자와 특수기호(_), (-)만 사용 가능합니다.
	var pid=document.querySelector("#pid");
	var id=document.querySelector("#inid");
	//아이디 정규식 
	id.onkeyup=function(){
		//지역변수로 넣어야됨.
		//^(캐럿)으로 고정값을 줘서 총 길이는 달라짐.
		var pattern1=/^[a-z]+[a-z0-9-_]{4,19}$/g; 
		if(pattern1.test(id.value)){
			pid.innerHTML="올바른 아이디 형식입니다.";
			pid.style.color="green"
		}else{
			pid.innerHTML="아이디는 영문소문자, 숫자, 특수기호로 5~20자입니다.";
			pid.style.color="red";
		}
	}
//	var id=document.querySelector("#inid");
//	id.onblur=function(){
//		var regexp= /^[a-z]+[a-z0-9-_]{5,20}$/g; //지역변수로 넣어야됨
//		if(regexp.test(id.value)){
//			alert("정상입니다.")
//		}else{
//			alert("올바르지 않은 아이디 입니다.")
//		}
//	}
//비밀번호 : 8~16자 영문 대소문자, 숫자, 특수문자를 사용하세요.
	var ppw=document.querySelector("#ppw");
	var pw=document.querySelector("#inpw");
	pw.onkeyup= function(){
		var pattern2=/^[A-Z]+[a-zA-Z0-9-_]{7,15}$/g;
		if(pattern2.test(pw.value)){
			ppw.innerHTML="올바른 비밀번호 형식입니다.";
			ppw.style.color="green";
		}else{
			ppw.innerHTML="올바르지 않은 비밀번호 형식입니다.";
			ppw.style.color="red";
		}
	}
//이메일주소 : 이메일주소를 다시 확인해주세요.
	var pe=document.querySelector("#pe");
	var email=document.querySelector("#ine");
	email.onkeyup=function(){
		var pattern3=new RegExp(/[\w-.]+\@[\w-.]+[\.]/g);
		if(pattern3.test(email.value)){
			pe.innerHTML="올바른 이메일 형식입니다.";
			pe.style.color="green";
		}else{
			pe.innerHTML="올바르지 않은 이메일 형식입니다.";
			pe.style.color="red";
			}
		}	
}
//				^문자	[문자열-문자열] {숫자,숫자}
//var regexp = /^[a-z]+[a-z0-9-_]{5,20}$/g; 플래그 문자
//if(regexp.test(id.value)){
//			정규식 메서드
}