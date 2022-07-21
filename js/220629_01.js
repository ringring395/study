/**
 * 29일 jQuery 연습문제
 */
 $(document).ready(function(){  //jQuery 선언
	 
 //1번. 쇼핑몰에서 상품의 개수를 입력할때 사용하는 폼을 완성하시오.
 //만약 값이 1인 상태에서 -버튼을 클릭하면 값이 감소되지 않고 1인 상태로 유지.	
	
	 //+버튼을 선택
	$("#plus").on("click",function(){
	 //quantity 변수에 수량을 저장.
	//전역변수면 1이 유지됨 -> plus함수의 지역변수로 해야됨.
	//Number를 씌워야 문자열이 숫자로 바뀜.
		var quantity = Number($("#quantity").val());
		//갯수를 1씩 증가시켜서 갯수입력란에 세팅.
		$("#quantity").val(quantity+1);
	})
	 //-버튼을 선택
	$("#minus").on("click",function(){
		var quantity = Number($("#quantity").val());
		//quantity변수에 저장되어 있는 값이 1이면
		if(quantity==1){
			// 갯수를 입력하는 텍스트 상자에 1을 세팅.	
			$("#quantity").val(1);
		}else{
			//그렇지 않으면 갯수를 1씩 감소시켜서 갯수입력란에 세팅.	
			$("#quantity").val(quantity-1);
		}
})
	
	
 })//$(document).ready 종료.