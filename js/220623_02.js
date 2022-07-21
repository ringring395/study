/**
 * 23일 학습
 */
/* 다음 코드의 실행 결과를 예측하세요.
 function test(a,b,c){
	alert(a)
	alert(a*b)
	alert(a*b*c)
}
test(10,100) */
//test라는 함수 선언
//function test(a,b,c){
//	alert(a)       //10
//	alert(a*b)     //1000
//	alert(a*b*c)   //NaN (Not a Number)
//	alert(c)       //undefined
//}
//test(10,100)

/*다음과 같은 함수를 만들어 보세요.
 * 1)함수이름 :power
 * -매개변수를 하나 넣으면 제곱해준다.(예:power(2)=4)
 * -매개변수를 두개 넣으면 첫번재 매개변수와 두번째 매개변수 제곱만큼 해준다.
 * (예: power(2,3)=8)
 */
//power 함수 선언
function power(a,b){
	//b가 undefined면 매개변수는 하나이다.
	//그렇지 않으면 매개변수는 둘이다.
	if(b==null){     //b가 비어있나요? =undefined 넣어도 됨.
		return a*a;  // =Math.pow(a,2) a제곱근
	}else {
		return a**b; // =Math.pow(a,b) a에 b제곱
//		반복문 for써도 됨
//		var result=1;
//		for(var i=1; i<=b; i++){
//			result*=a;
//		}
//		return document.write(result);
	}
}
//power 함수 호출
document.write(power(3)+'<br>');
document.write(power(2,3)+'<br>');
//power 함수를 삼항연산자로 표현.
function power1(a,b){
	return document.write(b==null? a*a:a**b +'<br>');    
}
power1(5,3);
power1(10);
/*2) 함수이름 :multiply
 * 매개변수로 넣은 값을 모두 곱해준다
 * (예; mutiply(1,2,3,4,5) =120 / mutiply(1,2,3)=6 
 * mutiply(3,4,5,9)=540 (hint: 가변인수,arguments)
 */
//배열/함수/반복문/출력
//multiply 함수 선언
function multiply(){
	var result=1;
	for(var i=0; i<arguments.length; i++){
		result*=arguments[i];
	}
	return document.write(result+'<br>');
 }
//multiply 함수 호출
multiply(1,2,3,4,5);
multiply(1,2,3);
multiply(3,4,5,9);