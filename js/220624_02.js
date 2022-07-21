/**
 * 24일 학습
 */
//아이디 입력란에 아이디의 길이를 체크하여 5~20 사이이면 정상입니다.
//그렇지 않으면 5~20이내로 입력하셔야 합니다.
//길이가 조건에 맞는지 확인하기.
// 웹브라우저 실행되자 마자
window.onload=function(){
	var p11=document.getElementById("p1");
	console.log(p11);
	var idinput=document.getElementById("a");
	console.log(idinput);	
	idinput.onkeyup=function(){
		var idcount=idinput.value.length;
		if(idcount>5 && idcount<=20){
			p11.innerHTML="정상입니다.";
			p11.style.color="green";
		}else {
			p11.innerHTML="아이디를 다시 확인해주세요.";
			p11.style.color="red";
		}
	}	
////////////////////////////////////////
	//id가 b인것을 가져와서 idchk에 저장.
	var idchk=document.querySelector("#b") 
	//입력되는 input과 이벤트를 연결 +익명함수 안에 있는것을 진행.
	idchk.onblur=function(){
		//value= 입력된 값을 가져옴.
		var idvalue=idchk.value; 
		//id가 p2인것을 가져와서 idinput에 저장.
		var idinput=document.querySelector("#p2");
		//if문으로 들어가서 length = idvalue 문자열의 글자 수를 구함.
			if(idvalue.length>=5 && idvalue.length<=20){
				idinput.innerHTML="정상입니다.";
				idinput.style.color="green";
			}else{
				idinput.innerHTML="5~20자 이내로 입력하셔야 합니다.";
				idinput.style.color="red";
			}
		}
}
