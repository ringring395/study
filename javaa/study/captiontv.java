package study;
//	자식 클래스
//captiontv와 inheritance_tv : 상속관계
public class captiontv extends inheritance_tv {
	//자막을 볼건지(true), 안볼건지(false)
	boolean caption;
	//자막을 보여주는 기능(메서드)
	void displaycaption(String text) {
		//caption에 저장되어 있는 값이 true면
		if(caption) {
			//자막을 보여주세요.
			System.out.println(text);
		}
	}
	
}//captiontv닫음
