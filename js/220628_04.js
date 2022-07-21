/**
 * 28일 연습문제
 */
 $(document).ready(function(){
 //1번. 쇼핑몰에서 상품의 개수를 입력할때 사용하는 폼을 완성하시오.
 //만약 값이 1인 상태에서 -버튼을 클릭하면 값이 감소되지 않고 1인 상태로 유지.
	 $("#p").on("click",function(){
		 var quantity = Number($("#co1").val());
		 $("#co1").val(quantity+1);
	 })
	 $("#m").on("click",function(){
		 var quantity = Number($("#co1").val());
		 if(quantity ==1){
			 $("#co1").val(1);
		 }else{
			 $("#co1").val(quantity-1);
		 }
	 })

//2번. 취미를 여러 개 선택하고, 그 결과를 알려주는 폼을 완성하시오.
//hint) 속성선택자, checked 논리값
	$("#su").on("click",function(){
		var str="";
		$("input[name='ch']:checked").each(function(){
			console.log($(this).val());
			str+= $(this).val();
			$("#su_result").html(str);
		})
	}) 

//3번. 취업포탈사이트에서 많이 사용하는 이력서의 글자수를 제한하는 폼을 완성하시오.
//hint) "입력할때마다" 어떤 이벤트를 사용해야 할지?
 $("#3input").on("keyup",function(){
	var inp=$("#3input").val();
	$("#3count").html(inp.length);
 })

//4번. 1번과 2번을 조합하여 아래를 완성하시오.
 //1. +연산  
 $("#4_1sum").on("click",function(){
	 var left4_1 = Number($("#4_1left").val());
	 console.log(left4_1);
	 var right4_1 = Number($("#4_1right").val());
	 console.log(right4_1);
	 var sum = left4_1 + right4_1;
	 $("#4_1result").val(sum);
 })
 //2. 총합구하기
 $("#4_2count").on("change",function(){
	 var left4_2 = Number($("#4_2left").val());
	 console.log(left4_2);
	 var count4_2 = $("#4_2count").val();
	 console.log(count4_2);
	 var result4_2 = left4_2 * count4_2;
	 $("#4_2result").html(result4_2);
 })
 //3.총합 구하기2(선택된 값만)
 $("#4_3sum").on("click",function(){
	//전역변수로 설정.(지역변수로 들어가면 계속 0반복이라서 마지막 값만 남음)
	 var sum = 0; 
	 $("input[class='4_3']:checked").each(function(){
		 // console.log($(this).val()); //배열로 저장.
		 sum += Number($(this).val());
		 $("#4_3result").html(sum);
	 })
 })
 
//5번. 실제 로그인 화면에 적용하는 유효성 검사를 완성하시오.
/*hint) <form>
 * 			아이디
 * 			비밀번호
 * 		</form>로 설정한 후 onsubmit이벤트 검색
 */

 $("form").on("submit",function(){
	 if($("#5id").val() == ""){
		 $("#5idd").html("아이디를 입력해주세요.").css("color","red");
		 return false;
	 }else if($("#5pw").val() == ""){
		 $("#5pww").html("비번을 입력해주세요.").css("color","red");
		 return false;
	 }
 })
	


 
 
 
 
 
 
 })//$(document).ready 종료.
