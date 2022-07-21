/**
 * 29일_jQuery 연습문제 3번
 */
//3번. 취업포탈사이트에서 많이 사용하는 이력서의 글자수를 제한하는 폼을 완성하시오.
//hint) "입력할때마다" 어떤 이벤트를 사용해야 할지?

 $(document).ready(function(){
	 //textarea태그에 keyup이벤트 연결
	 $("#3input").on("keyup",function(){
		 //입력된 문자열을 변수로 설정
		 var input=$("#3input").val();
		 //input변수의 길이를 id:3count에 입력
		 $("#3count").text(input.length);
		 //변수없이 설정.
		//$("#3count").text($("#3input").val().length);
	 })				//text말고 html도 가능
	 
 })//$(document).ready 종료.