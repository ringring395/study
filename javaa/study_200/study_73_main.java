package study_200;

public class study_73_main {
	//수학 관련 메소드
	public static void main(String[] args) {
		//고정 메소드 호출
		System.out.println("자연로그"+Math.E);
		System.out.println("원주율"+Math.PI);
		//음수의 절대값
		System.out.println("절대값"+Math.abs(-500));
		//원주율 값 3.14를 올리고버리고 요리조리 해보자.
		System.out.println("올림"+Math.ceil(3.14));
		System.out.println("반올림"+Math.round(3.14));	//정수
		System.out.println("반올림"+Math.rint(3.14));		//소수
		System.out.println("버림"+Math.floor(3.14));
		//최댓값, 최솟값
		System.out.println("최댓값"+Math.max(41, 78));
		System.out.println("최솟값"+Math.min(41, 78));
		//거듭제곱
		System.out.println("거듭제곱"+Math.pow(2, 5));
		System.out.println("거듭제곱"+Math.pow(4, 2));
		//랜덤
		System.out.println("랜덤값"+(int)(Math.random()*100));
	}
}
