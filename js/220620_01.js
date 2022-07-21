/**
 * 20일 학습
 */
/*if(조건식) {
   참일때의 문장
}
ex)평균이 60점 이상이면 합격
*/
var avg=70; //평균(avg)에 70 저장.
if(avg>=60){
	alert("합격")
}
/*if(조건식) {
   참일때의 문장
}else {
   거짓일때의 문장
}
ex)평균이 60점 이상이면 합격, 그렇지 않으면 불합격
*/
var avg=50;
if(avg>=60){
	alert("합격")
}else{
	alert("불합격")
}
/*if(조건식) {
	참일때의 문장
}else if(조건식){
	참일때의 문장
}else {
	거짓일때의 문장
}
ex) 평균이 60점 이상이면 합격, 평균이 50점 이상이면 보류,
그렇지 않으면 불합격
*/
if(avg>=60){
	alert("합격")
}else if(avg>=50){
	alert("보류")
}else{
	alert("불합격")
}

/*평균이 60점 이상이고, 총점이 300점 이상이면 합격, 그렇지 않으면 불합격*/
var 국=Number(prompt("국어 점수를 입력하세요."));
var 수=Number(prompt("수학 점수를 입력하세요."));
var 영=Number(prompt("영어 점수를 입력하세요."));
var sum=(국+수+영);
alert(sum);
var avg=(sum/3);
alert(avg);
if(avg>=60 && sum>=300){
	alert("합격")
}else{
	alert("불합격")
}

// switch
var num=10;
switch(num){
	case 10:
		alert("num값은 10입니다.")
		break;
	case 20:
		alert("num값은 20입니다.")
		break;
	case 30:
		alert("num값은 30입니다.")
		break;
}



