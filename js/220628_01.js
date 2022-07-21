/**
 * 28일 학습 (정규식 복습)
 */

window.onload=function(){
	var sp=document.querySelector("#sp");
	var input=document.querySelector("#mail");
	input.onkeyup=function(){
		var pattern=/^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/g;
		if(pattern.test(input.value)){
			sp.innerHTML="올바른 이메일 형식입니다 'ㅅ'";
			sp.style.color="blue";
		}else{
			sp.innerHTML="올바르지 않은 이메일 형식입니다.";
			sp.style.color="red";
		}
	}
	var spw=document.querySelector("#spw");
	var inputpw=document.querySelector("#inp");
	inputpw.onkeyup=function(){
		var pattern1=/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#?!@$%^&*-])[\w#?!@#$%^&*-]{8,16}$/g;
		if(pattern1.test(inputpw.value)){
			spw.innerHTML="올바른 비번 형식입니다^_^";
			spw.style.color="blue";
		}else{
			spw.innerHTML="비번은 8~16자 사이의 영대소문자,숫자,특수문자로 입력해주세요.";
			spw.style.color="red";
		}
	}
	var spw2=document.querySelector("#spw2");
	var inputpw2=document.querySelector("#inp2");
	inputpw2.onblur=function(){
		if(inputpw.value == inputpw2.value){
			spw2.innerHTML="입력한 두 비밀번호가 일치합니다";
			spw2.style.color="green";
		}else{
			spw2.innerHTML="비밀번호를 다시 확인해주세요.";
			spw2.style.color="red";
		}
	}
	
	var sid=document.querySelector("#sid");
	var inputid=document.querySelector("#ini");
	inputid.onkeyup=function(){
		var pattern2=/^[a-z]+[a-z0-9_-]{4,19}$/g;
		if(pattern2.test(inputid.value)){
			sid.innerHTML="올바른 ID형식 입니다^^.";
			sid.style.color="blue";
		}else{
			sid.innerHTML="ID는 5~20자 사이의 영소문자,숫자,특수문자로 입력해주세요.";
			sid.style.color="red";
		}
	}
}