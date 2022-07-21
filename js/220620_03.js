/**
 * 
 */
//for문으로 구구단 5,6단 출력
for(var i=5; i<=6; i++){
	for(var j=1; j<=9; j++){
		document.write(i+'*'+j+'='+(i*j));
		document.write('<br>');
	}
}


//for문으로 1~100 출력
for(var num=1; num<=100; num++){
	document.write(num,'<br>')
}


//while문으로 1~100 출력
var num1=1;
while (num1<=100){
	document.write(num1,'<br>');
	num1++
}


//Do~while문으로 1~100 출력
var num2=1;
do{
	document.write(num2,'<br>');
	num2++;
}
while(num2<=100)