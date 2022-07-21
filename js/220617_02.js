/**
 * 대화상자 (alert, confirm, prompt)
 */
//alert('Hello')
//confirm ('hi')
//var result=confirm("반가워여")
//alert(result) //확인:true, 취소:false
//result값이 (확인)true이면
//삭제
//result값이 (취소)false이면
//원래대로


var age=prompt("나이를 입력해주세요.")
if(age>=20){
	alert("성년");
}else{
	alert("미성년");
}

var q=prompt("무슨 구에 사시나요?\n아래 보기 중 하나를 골라 입력하세요." +
		"\n1.남구 2.중구 3.동구 4.북구 5.울주군")
switch(q){
	case "남구":
		alert("어서오세요. 남구민")
		break;
	case "중구":
		alert("어서오세요. 중구민")
		break;
	case "동구":
		alert("어서오세요. 동구민")
		break;	
	case "북구":
		alert("어서오세요. 북구민")
		break;
	case "울주군":
		alert("어서오세요. 울주군민")
		break;	
} return q;

var re=confirm("버튼을 누르세요.")
re?alert("확인을 눌렀습니다."):alert("취소를 눌렀습니다.")
var n=Number(prompt("숫자를 입력하세요."))
n>0?alert("자연수입니다."):alert("자연수가 아닙니다.")

var n2=typeof(prompt('숫자를 입력하세요'));
switch(n2%2){
case 0:
	alert("짝수");
	break;
case 1:
	alert("홀수");
	break;
default:
	alert("숫자를 입력하세요");
	break;
}
