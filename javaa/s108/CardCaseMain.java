package s108;

public class CardCaseMain {
	public static void main(String[] args) {
		CardCase cc = new CardCase();
		System.out.println("==20장 출력==");
		cc.make();		//서로 다른 카드 20장 만들기
		cc.print();		//카드 출력
		System.out.println("==섞고 출력==");
		cc.shuffle();	//카드 섞기
		cc.print();		//카드 출력
		System.out.println("==섞고 출력==");
		cc.shuffle();	//카드 섞기
		cc.print();		//카드 출력
		System.out.println("==정렬==");		
		cc.sort();		//정렬	
		cc.print();		//카드 출력
		System.out.println("==역순 정렬==");
		cc.rsort();		//역순 정렬		
		cc.print();		//카드 출력
		System.out.println("==Lambda 정렬==");		
		cc.lambdasort();//Lambda 정렬
		cc.print();		//카드 출력
		System.out.println("==Lambda 역순 정렬==");
		cc.lambdarsort();//Lambda 역순 정렬
		cc.print();		//카드 출력
	}
}
