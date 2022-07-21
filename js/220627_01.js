/**
 * 27일 학습 정규식
 */
window.onload=function(){
	//아이디 5~20자
var si=document.querySelector("#s");
var ii=document.querySelector("#i");
	ii.onkeyup=function(){
		var inputid=ii.value.length;
		if (inputid>=5 && inputid <=20){
			si.innerHTML="정상입니다.";
			si.style.color="green";
		}else{
			si.innerHTML="5~20자를 입력해주세요";
			si.style.color="red";
		}
	}
	//비밀번호는 8~16자 이내로 입력하셔야 합니다.
var spw=document.querySelector("#sp");
var ipw=document.querySelector("#ip");
	ipw.onkeyup = function(){
		var inputpw=ipw.value;
		if(inputpw.length>=8 && inputpw.length<=16){
			sp.innerHTML="정상입니다.";
			sp.style.color="green";
		}else{
			sp.innerHTML="8~16자를 입력해주세요";
			sp.style.color="red";
		}
	}
//비밀번호 재확인
//위 비밀번호와 비밀번호 재확인해서 입력한 값이 같아야 합니다.
	var sp2=document.querySelector("#sp2");
	var ip2=document.querySelector("#ip2");
		ip2.onkeyup=function(){
			var inputpw2=ip2.value;
			if(ipw.value == inputpw2){
				sp2.innerHTML="두 비밀번호가 동일합니다 ^^";
				sp2.style.color="blue";
				return true;
			}else{
				sp2.innerHTML="동일한 비밀번호를 입력해주세요.";
				sp2.style.color="red";
				return false;
			}
		}	
}