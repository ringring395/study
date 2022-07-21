/**
 * 24일 학습_객체
 */
//document.write("hi");
//document.bgColor="gray";
////객체 선언
//var product={
//		//속성(객체 안의 변수)
//		pro : "samsung", 
//		cate :"electronic",
//		//메소드(함수)
//		aa:function(made){
//			document.write(made+"에서 만듭니다.")
//		}
//}
//document.write(product.pro)
//product.aa("한국")
////선택자
window.onload=function(){
	var hid=document.getElementById('h11');     //id 선택자
	var hclass=﻿document.getElementsByClassName("h222");     //class 선택자
	var htag=document.getElementsByTagName("h1");     //tag 선택자
	console.log(hid);
	console.log(hclass);
	console.log(htag);

//id 이용한 선택자(querySelector)
var qid = document.querySelector('#h14');
var qclass = document.querySelectorAll(".h222" );
var qtag = document.querySelectorAll("h1" );
	console.log(qid);
	console.log(qclass);
	console.log(qtag);
	
var id=document.querySelector('p');
	//p태그, innerHTML영역에 문자열을 넣어라.
	id.innerHTML="5~20자의 영문 소문자, 숫자, 특수기호만 사용 가능합니다."
	//p태그, 글자색 변경
	id.style.color="red"
	//p태그, 배경색(css:background-color) 노란색
	id.style.backgroundColor="yellow"

var img=document.querySelector('img');
	//<img src="D:\01-STUDY\image/cosmos.jpg">
	//태그명	속성		값
var c=0;
var button=document.querySelector("input")
	//사진 변경 클릭하면
	button.onclick=function(){
	if(c==0){
		img.setAttribute("src","D:/01-STUDY/image/a2.jpg");
		c++;
	}else if(c==1){
		img.setAttribute("src","D:/01-STUDY/image/a3.jpg");
		c++;
	}else if(c==2){
		img.setAttribute("src","D:/01-STUDY/image/a4.jpg");
		c++;
	}else if(c==3){
		img.setAttribute("src","D:/01-STUDY/image/hodori.jpg");
		c=0;
	}
}	
//button.onmouseover=function(){
//	p11.innerHTML="요리방법을 설명드립니다.";
//}
//
//var btn =document.getElementById("h1").addEventListener('click',hello);
//btn.onclick =function(){
//	alert("제출완료")
//}















}