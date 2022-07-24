package study;
public class man extends people{
	//오버라이딩
	void printInfo() {
		super.printInfo();	//부모클래스의 메소드 호출
		System.out.println("그리고, 남자입니다.");
	}
	void enlist() {
		System.out.println("군대감.");
	}
	
	
	
	
}
