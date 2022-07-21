/**
 * 반복문 연습문제
 */
/*1. 이전 연습문제에서 입력에 "안녕"이 들어가 있으면 "안녕하세요"를 출력하는 프로그램을 
 * 작성하였습니다.여기에 반복문을 적용해서 계속해서 입력을 받게 하고, 
 * 입력한 문장에 다양한 질문과 답변을 하는 프로그램을 만들어보세요.
 * ("잘 있어'를 입력하면 반복문을 종료해서 벗어나게 만들어보세요.)
 */
//while에 else if fh dusekfdk wlsgod.
//while(true){
//	var hi=prompt("인사말을 입력하세요.");
//	if(hi=="안녕"){
//		alert("안녕하세요")
//	}else if(hi=="hello"){
//		alert("반가워요")
//	}else if(hi=="hi"){
//		alert("어서오세요")
//	}else if(hi=="잘 있어"){
//		break;
//	}
//}
//var hi="";
//while(hi!="잘 있어"){
//	hi=prompt("인사말을 입력하세요.");
//	if(hi=="안녕"){
//		alert("안녕하세요")
//	}else if(hi=="hello"){
//		alert("반가워요")
//	}else if(hi=="hi"){
//		alert("어서오세요")
//	}
//}


/*2. 1~100까지 더하는 프로그램을 만들어보세요.
 * (hint: 변수 하나 더 필요, 지역변수 vs 전역변수)*/
var sum=0;
for(var i=1; i<=100; i++){
	sum+=i; //복합 대위 연산자 sum=sum+i
}
document.write(sum);

var sum=0;
var n=1;
while (n<=100){
	sum+=n;
	n++;
}
document.write(sum)


/*3. 2번 문제에 사용자에게 두 수를 입력받아 특정한 숫자부터 특정한 숫자까지 
 * 더하는 프로그램을 만들어보세요. */
//var sum1=0;
//var n1=Number(prompt("첫번째 숫자를 입력해주세요."));
//var n2=Number(prompt("두번째 숫자를 입력해주세요."));
//
//var tmp=0;		//if문 (값을 기억할 임시 변수가 하나 더 필요함)
//if(n1>n2){		//조건: n1이 n2보다 크면
//	tmp=n1;		//n1의 값을 tmp에 넣고,
//	n1=n2;		//n2의 값을 n1에 넣고,
//	n2=tmp;		//tmp의 값을 n2에 넣는다.
//}
//for (var i=n1; i<=n2; i++){
//	sum1+=i
//}
//document.write(sum1)

//var sum1=0;
//var n1=Number(prompt("첫번째 숫자를 입력해주세요"));
//var n2=Number(prompt("두번째 숫자를 입력해주세요"));
//var i=n1;
//while(i<=n2){
//	sum1+=i;
//	i++;
//}
//document.write(sum1)


/*4. 구구단 2단을 반복문으로 만들어보세요. */
for (var i=1; i<10; i++){
	document.write('2*'+i+'='+(2*i)+'<br>');
}

var i=1;
while (i<10){
	document.write('2*'+i+'='+(2*i)+'<br>')
	i++;
}


/* 5. 구구단 2~9단까지 반복문으로 만들어보세요(keyword:중첩 반복문) */
for(var i=2; i<=9; i++){
	for(var j=1; j<=9; j++){
		document.write(i+'*'+j+'='+(i*j));
		document.write('<br>');
	}
}

var i=2;
var j=1;
while (i<=9){
	i++;
	while(j<=9){
		document.wirte(i+'*'+j+'='+(i*j)+'<br>');
		j++;
	}
}
//3의 배수마다 '짝👏!!'이라고 입력.
//var n3=3;
//for(var i=1; i<=100; i++){
//	if(i%n3==0){
//		document.write('짝👏!!<br>');
//		continue;
//	}
//	document.write(i+'<br>');
//}
//// 삼각형 별찍기
//for(var i=0; i<=20; i++){
//	for(var j=0; j<=i; j++){
//		document.write('💡')
//	}
//	document.write('<br>')
//}
//// 정삼각형 별찍기
//for(var i = 0; i < 5; i++)  {
//	  for(var j=4; j > i; j--)  {
//	    document.write('&nbsp'); //&nbsp : 줄바꿈없는 공백
//	  }
//	  for(var j=0; j <= i; j++)  {
//	    document.write('👍');
//	  }
//	  for(var j=1; j <= i; j++)  {
//	    document.write('👍');
//	  }
//	  document.write('<br>');
//	}