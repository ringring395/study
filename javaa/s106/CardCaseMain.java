package s106;

public class CardCaseMain {
	public static void main(String[] args) {
		CardCase cc = new CardCase();
		//서로 다른 카드 20장 만들기
		cc.make();
		//카드 출력
		cc.print();
		System.out.println("-----");
		//카드 섞기
		cc.shuffle();
		//카드 출력
		cc.print();
		System.out.println("-----");
		//카드 섞기
		cc.shuffle();
		//카드 출력
		cc.print();
	}
}
