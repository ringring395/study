/**
 * 함수
 */
//함수 선언(더하기를 위한 함수)
function add(a, b){
	
	return a+b;
}
//함수 호출
document.write(add(5,7)+'\n')

/* 가로(밑변):3
 * 세로(높이) :4
 * 일때 삼각형의 넓이를 구하는 함수를 작성하시오.(선언문 호출, 둘다)*/
function i(a,b){
	return a*b/2;
}

document.write(i(3,4))

/* 김군: 국80, 영80, 수100
 * 박군: 국100,영80, 수50
 * 이군: 국60, 영100, 수60
 * 학생들 평균 점수 구하기 */
function avg(a,b,c){
	return (a+b+c)/3;
}
// 배열로 더 간편하게 하는 방법?
document.write('김군'+avg(80,80,100)+'<br>'
		+'박군'+avg(100,80,50)+'<br>'
		+'이군'+avg(60,100,60))
