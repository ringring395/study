package study;

public class Sutda_Exercise2 {
	public static void main(String[] args) {
		//인스턴스 생성(card1)		(생성자 호출/매개변수 2개인 생성자)
		SutdaCard card1 = new SutdaCard(3,false);
		//인스턴스 생성(card2)		(매개변수 없는 생성자 ->기본생성자)
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());


	}//메인메소드 닫음
} //sutda_Exercise2 닫음
