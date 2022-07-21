/**
 * 
 */
// "출력"이라는 문자열을 알림창으로 10번 띄우세요~
// 반복문이 없으면 alert10번 사용하면 된다.
//		1		2	4
// 				5	7
//				8	10		
//				11	13
//				14	16
//				17  19
//				20	22
//				23	25
//				26	28
//				29	31
//				32
for (var i=0; i<10; i++){
	alert("출력="+i) //3  6  9  12  15  18	21 24	27	30
}

var i=0;
while (i<10){
	alert("출력");
	i++;
}

var i2=11;
do{
	alert("출력="+i2);
	i2++;
}
while (i<10)
	
while (i2<10){
	alert("출력"+i2);
	i2++
}
//반복문에서 사용이 되는 break continue 키워드
for(var i=0; i<10; i++){
	alert(i+"번째 반복문입니다.")
	//진행 여부를 물어봐서 진행하지 않겠다고 하면
	//반복을 멈춰라.
	if(!confirm("계속 하시겠습니까")){
		break;
	}
}*/
	
// 1~10까지 짝수만 알림창으로 알리기
//for(var i=1; i<=10; i++){
//	//i가 홀수이면
//	//멈추고 다시 실행.
//	if(i%2==1){
//		continue;
//	}
//	alert(i);
//}

while(true){
var hi=prompt("인사를 입력하세요.");
	if(hi=="안녕"){
		alert("반갑습니다.")
	}else if(hi=="반가워"){
		alert("나도 반갑습니다.")
	}else if(hi=="hello"){
		alert("어서오세요.")
	}else if(hi=="잘 있어"){
		alert("Bye");
		break;
	}
}

var sum=0;
for(var i=1; i<=100; i++){
	sum+=i;
}
document.write(sum);

















