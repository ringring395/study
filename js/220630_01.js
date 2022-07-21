/**
 * 30일 학습
 */
window.onload=function(){
	//1번문제
	var plus = document.querySelector("#plus");
	var minus = document.querySelector("#minus");
	plus.onclick=function(){
		var quantity = document.querySelector("#quantity");
		var result1 = Number(quantity.value) + 1;
		quantity.value=result1;
	} //1번 plus 닫음.
	minus.onclick=function(){
		var quantity = document.querySelector("#quantity");
		var result_m = Number(quantity.value);
		if(result_m == 1){
			quantity.value=1;
		}else{
			quantity.value=result_m-1;
		}
	} //1번 minus 닫음
	
	//2번 문제
	var btn2 = document.querySelector("#btn2");
	var result2 = document.querySelector("#result2");
	//자바스크립트에서 속성선택자관련.
	btn2.onclick=function(){
		var str=[];
		var checked = [document.querySelectorAll(".hobby:checked")];
		console.log(checked);
		str += checked.value;
		result2.innerHTML=str;
	}//2번 닫음
	
	//3번 문제
	var input = document.querySelector("textarea");
	input.onkeyup = function(){
		var inputnum = input.value;
		result3.innerHTML=inputnum.length;
	}//3번 닫음
	
	//4번 문제
	
} //window.onload 닫음.
