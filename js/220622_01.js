/**
 * 22일 학습.(중첩 & 배열)
 */
//중첩 for 문	1	2	
//					18
//				19(다시 밑에 for문으로 내려감)	
for (var i=1; i<3; i++){
//			3	4		
//				7		6
//				10		9
//				13		12
//				16		15 (j=5)
//			20	21	
	for(var j=1; j<5; j++){
		console.log(i+"-"+j)//	5	8	11	14	
	}
	console.log(i+"번째 반복문이 끝났습니다.")//	17
}
// 최초 for문 한번돌고, 안에 for문 싹 돌고~
//다시 최초 for문을 한번 돌고, 안에 for문 싹 도는 거 반복.

//배열(array)
//a라는 이름의 배열을 선언하고 10,20,30 값을 초기화해라.
var a=[10,20,30,50,80,1,2];
alert(a.length)
var sum=0;
//document.write(a+'<br>');
//document.write(a[1]+'<br>');
//document.write(a[0]+'<br>');
//document.write(a[0]+a[1]+a[2]+'<br>');
for(var i=0; i<3; i++){
	sum+=a[i]
}
document.write(sum+'<br>')
sum1=0;
for(var i=0; i<a.length; i++){
	sum1+=a[i]
}
document.write(sum1+'<br>')