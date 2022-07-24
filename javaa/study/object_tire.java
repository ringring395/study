package study;
public class object_tire { //객체 수업. **메인 메소드없이 ** (만든거 삭제함)

	// 속성(변수)
	//전역변수
	int width = 205;		//인스턴스 변수
	static int rim = 15;	//클래스 변수
	int ratio = 75;			//인스턴스 변수
	
	// 메서드(함수)
	//void, 해당되는 자료형 넣으면된다.
	//javascript에서는 function weight(a,b){}
	//			함수		매개변수
	static void weight(int a, int b) { //매개변수에도 타입지정.
		int e;				//지역변수
		System.out.println("(weight)하중을 지탱하는 기능");
	}
	static void transform(int c) {		//함수 메소드
		System.out.println("(transform)진행방향을 전환하는기능");
	}
	void ease(float d) {				//함수 메소드
		System.out.println("(ease)노면으로부터 충격을 완화하는 기능");

		
	}
}
