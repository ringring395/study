package study;
//1번_부모클래스
public class Entry {
	//속성
	String word;		//인스턴스 변수(약어 저장)
	//메소드 종류 중에서 생성자
	Entry() {}			//기본 생성자 (매개변수 없는 생성자)
	Entry(String w) {	//매개변수가 하나인 생성자
		word = w;
	}
	//메소드: 매개변수 없고, 리턴도 없는 인스턴스 메소드
	public void writeView() {	//약어 출력
		System.out.println("약어 : "+word);
	}	
}//Entry닫음
