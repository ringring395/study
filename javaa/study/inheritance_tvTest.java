package study;

public class inheritance_tvTest {
	public static void main(String[] args) {
//tv클래스의 인스턴스 생성
//new inheritance_tv() : 새로운 주소(t) 생성
//inheritance_tv() : 생성자 호출
		//포함관계 (tv안에 t 주소를 만들었음)
		captiontv t = new captiontv();
		
		//tv클래스의 channel변수에 10 초기화
		t.channel = 10;
		t.channelup();
		System.out.println(t.channel);
		
		t.displaycaption("자막 봄1");
		t.caption = true;
		t.displaycaption("자막 봄2");
		
		
		

	}//메인메소드 닫음
}//inheritance_tvTest닫음
