package study;
public class Constructor {
	int a;	//인스턴스 변수
	int b;	//인스턴스 변수
	int c;	//인스턴스 변수
	//기본생성자(매개변수 없는 생성자)
	Constructor( ){
		this(10,20,30);
	}
	//생성자 선언
	Constructor(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}//Constructor닫음
