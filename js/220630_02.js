/**
 * 30일 학습_효과
 */
$(document).ready(function(){
//$(선택자).메서드명 ( )
	//show효과 (hide가 되어야 show가 작동함.)
	$("#show").on("click",function(){
		$("h1").show("fast");
	})
	//hide효과
	$("#hide").on("click",function(){
		$("h1").hide();
	})
	//toggle효과
	$("#toggle").on("click",function(){
		$("h1").toggle();
	})
	//slideDown효과
	$("#slidedown").on("click",function(){
		$("h1").slideDown();
	})
	//slideup효과
	$("#slideup").on("click",function(){
		$("h1").slideUp();
	})
	//slidetoggle효과
	$("#slidetoggle").on("click",function(){
		$("h1").slideToggle();
	})
	//fadein효과
	$("#fadein").on("click",function(){
		$("h1").fadeIn();
	})
	//fadeout효과
	$("#fadeout").on("click",function(){
		$("h1").fadeOut();
	})
	//fadetoggle효과
	$("#fadetoggle").on("click",function(){
		$("h1").fadeToggle();
	})
//사용자 지정 효과
//animate함수
	$("div").on("click",function(){
		$("div").animate({
			left:200, width:"+=50", height:"+=50"})
	})
	
	
	
	
	
	
	
	
	
	
	
	
})// document.ready닫음