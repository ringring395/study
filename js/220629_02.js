/**
 * 29일_ jQuery 연습문제 2번
 */
//2번. 취미를 여러 개 선택하고, 그 결과를 알려주는 폼을 완성하시오.
//hint) 속성선택자, checked 논리값

 $(document).ready(function(){
	 //버튼 태그를 선택 -> 클릭이벤트 연결(on)
	 $("button").on("click",function(){
		 var str= ""; //처음에는 빈칸이고,
		 //속성선택자 : "요소[속성='값']" (checkbox라서 바로 배열 저장)
		 //사용자가 어떠한 항목을 체크했는지 여부파악
		 //input의 name속성이 ch인 것 중에 체크된것(:checked) 선택.
		 $("input[name='ch']:checked").each(function(){
			 //사용자가 선택한것 $(this)에 대한 값을 가져오기.
			 str +="<h3>"+$(this).val()+"</h3>";
			 console.log(str);
			 $("div").html(str); //div 공간에 넣었음.h3태그도 가능.
		 })
	 })
})  //$(document).ready 종료.

