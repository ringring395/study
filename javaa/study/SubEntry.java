package study;
//1번 자식 클래스
public class SubEntry extends Entry{
	//속성
	String definition;		//인스턴스 변수(원어 저장)
	int year;				//인스턴스 변수(시기 저장)
	//메소드 중 생성자
	SubEntry(String w2) {	//매개변수 하나
		word = w2;
	}
	SubEntry(String w3, String d, int y) {//매개변수 3개
		this(w3);
		definition = d;
		year = y;
	}
	//메소드: 매개변수 없고, 리턴도 없는 인스턴스 메소드
	public void printView() {	//원어, 시기 출력
		System.out.println("*****약어사전*****");
		super.writeView();
		System.out.println("원어 : "+definition);
		System.out.println("시기 : "+year);
	}
}//SubEntry 닫음
