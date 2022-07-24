package study;
public class woman extends people {
	//오버라이딩
	void printInfo() {
		super.printInfo();	//부모클래스의 메소드 호출
		System.out.println("그리고, 여자입니다.");
	}
	void makeup() {
		System.out.println("메이크업");
	}

}
