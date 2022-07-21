/**
 * 29일 jQuery 연습문제 4번
 */
//4번. 1번과 2번을 조합하여 아래를 완성하시오.
 $(document).ready(function(){
 //1. +연산  
	$("#4_1sum").on("click",function(){
		// alert("aa") click 이벤트랑 연결되었는지 확인
		var left=Number($("#left4_1").val()); //클릭하면 값 가져와야함.
		var right=Number($("#right4_1").val());
		var result=left + right;
		// console.log(result); result값 확인
		// input태그에 값 넣기 -> 태그선택자.val(값);
		$("#result4_1").val(result);
	})
	
 //2. 총합구하기
  $("#count4_2").on("change",function(){
	  var left2=Number($("#price").val());
	  var count=$("#count4_2").val();
	  // console.log(count);
	  var result2=left2 * count;
	  // console.log(result2);
	  $("#result4_2").text(result2); //html해도 됨.
// $("#result4_2").text(Number($("#price").val()) * $("#count4_2").val());
  }) //change 함수 닫음.
  
 //3.총합 구하기2(선택된 값만)
 $("#4_3sum").on("click",function(){
	//전역변수로 설정.(지역변수로 들어가면 계속 0반복이라서 마지막 값만 남음)
	 var sum=0;
	//input-type-checkbox 중 체크된 것만 선택(속성선택자:checked)
	 $("input[type='checkbox']:checked").each(function(){
		// console.log($(this).val()); //배열로 자동저장.
		//sum = sum + Number($(this).val());
		sum += Number($(this).val());
		 $("#4_3result").html(sum);
	 }) //checked 함수 종료.
 }) //click이벤트 종료.


	 
 }) //$(document).ready 종료.
 