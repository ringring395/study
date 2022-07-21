/**
 * 문제 풀이
 */
//1.변수명을 carName으로 지정하고 Volvo 값을 저장하는 변수를 선언하세요.
var carName="Volvo";
alert(carName);

//2.x라는 변수를 작성하고 값 50을 지정하세요.
var x=50;
alert(x);

//3. 두 개의 변수 x와 y를 사용하여 5+10의 합을 알림창에 표시하세요.
var x=5;
var y=10;
alert(x+y);

//4. z라는 변수를 작성하고 x+y를 지정하고 결과를 알림창에 표시하세요.
var z=x+y;
alert(z);

//5. confirm창에 내용을 "진짜로 삭제하시겠습니까?"로 표시하고, 
//확인을 누르면 "삭제됨 알림창을 띄우고, 취소를 누르면 "취소됨"을 알림창에 띄우세요.
//if 조건식에는 true false 값이 나올 수 있도록 입력해야함.
var result=confirm("진짜로 삭제하시겠습니까?")
if (result){
	alert("삭제됨");
}else{
	alert("취소됨");
}
//삼항 연산자 조건식?참:거짓
result?alert("삭제됨"):alert("취소됨")

if (confirm("진짜로 삭제하시겠습니까?")) {
	alert("삭제됨");
}else {
	alert("취소됨");
}
//6. 첫번째 prompt창에는 10을 입력하고, 두번째  prompt창에는 20을 입력하여
//그 두수 합을 알림창에 띄우세요.
var a=Number(prompt("10 입력하세요"));
var b=Number(prompt("20 입력하세요"));
alert(a+b)
//숫자를 넣더라도 문자로 입력되기 때문에 숫자로 변환시켜야함.(데이터 형 변환)
//7. prompt창에 나이를 입력하고, 그 나이가 19세 이상이면 "인증됨"으로 알림창에
//띄우세요.(hint:조건문)
var age=Number(prompt("나이를 입력하세요"));
if (age>=19) {
	alert("인증됨");
}
var age2=(prompt("나이를 입력하세요"));
if (age2>=19) {
	alert("인증됨");
}