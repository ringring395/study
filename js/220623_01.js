/**
 * 23일 학습
 */
//함수명 없는 익명함수의 경우, 호출부가 선행되면 함수 실행되지 않음.
//var add=function(a,b){
//	return a+b;
//}
//alert(add(5,7))
//익명함수
//var callback = function (){
//	document.write("콜백 함수\t")
//}
////콜백함수 선언
//function callbacktest(){
//	//3번반복
//	for (var i=0; i<3; i++){
//		//매개변수로 전달된 함수 호출
//		callback();
//	}
//}
////콜백함수 호출
//callbacktest();
//
//function c(){
//	for(i=0; i<3; i++){
//		document.write("2번테스트")	
//	}
//}
//c();
//
//var tt = function(){
//	document.write("테스트를 해봅시다.<br>")
//}
//function test(){
//	for(var i=0; i<3; i++){
//		tt();
//	}
//}
//test();

function name(lastname,firstname, call){
	var namae=lastname+firstname;
	call(namae);
}
function hello(a){
	document.write("반가워요 "+a+"입니다.")
}
function bye(a){
	document.write("저는 "+a+"이었어요. Bye")
}
name("R","ring",hello);	//반가워요 Rring입니다.
name("R","ring",bye);		//저는 Rring이었어요. Bye


























