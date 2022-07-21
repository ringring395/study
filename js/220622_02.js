/**
 * 22일 연습문제
 */
/*아래 데이터는 A학교의 학생들의 국어점수 성적입니다.
a : 52
b : 73
c : 100
d : 32
e : 57
f : 100
g : 31
h : 20
위 학생의 총점과 평균을 구하시오. */
var a=[52,73,100,32,57,100,31,20]
var sum=0;
for(var i=0; i<a.length; i++){
	sum+=a[i];
	var avg=sum/a.length;	
}
document.write(sum+'<br>'); //밖으로 빼야 한번만 실행됨.
document.write(avg); //=(sum/a.length) / avg변수 따로 안주고도 할수있음.

