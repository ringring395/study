package study;
//2번 부모클래스
public class Health {
	//속성(static X : 3개 모두 인스턴스 변수)
	char gender;	//성별
	double tall;	//신장
	double weight;	//체중
	//생성자
	Health(){}		//매개변수가 없는 기본 생성자
	//메소드
	void input(char gender, double tall, double weight) {
		//성별, 신장, 체중 입력받기
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}
//	void input() {
//		//성별, 신장, 체중 입력받기
//		System.out.println("***비만도 Check***");
//		System.out.print("성별(M/F) : ");
//		gender = s.next().charAt(0);
//		System.out.print("신장(Cm) : ");
//		tall = s.nextDouble();
//		System.out.print("체중(Kg)  : ");
//		weight =s.nextDouble();
//	}
	void output1() {
		System.out.println("성별 - "+gender);
		System.out.println("신장 - "+tall+"Cm");
		System.out.println("체중 - "+weight+"Kg");
	}
	
}//부모클래스 닫음
