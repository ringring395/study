/**
 * jquery연습문제 1
 * 1. 쇼핑몰에서 상품의 개수를 입력할 때 사용하는 폼을 완성하시오.
 */
$(document).ready(function(){
	
})

function plusminus(op){
	var quantity = Number($("#quantity").val());
	// op가 "+"이면
	if(op=="+"){
		//$("#quantity").val(quantity+1);
		$("#quantity").val(++quantity);
	}else{	// 그렇지 않으면
		if(quantity==1){
			$("#quantity").val(1);		
		}else{
			//$("#quantity").val(quantity-1);
			$("#quantity").val(--quantity);		
			
		}
	}

}


