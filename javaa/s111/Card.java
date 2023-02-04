package s111;

public class Card {
	private String cardVal;	//H8, H6
	//멤버 접근 메소드
	public String getCardVal() {
		return cardVal;
	}
	//기본 생성자 - 멤버 초기화
	public Card() {
		int deck=(int)(Math.random()*CardUtil.suit.length);	//0~1
		int suit=(int)(Math.random()*CardUtil.valu.length);	//0~9
		//임의의 카드값을 가짐 H6
		cardVal = CardUtil.suit[deck]+CardUtil.valu[suit];
	}
	//테스트용
	public Card(String s) {
		this.cardVal=s;	//문자열은 값 복사
	}
	//복사 생성자
	public Card(Card c) {
		this(c.getCardVal());	//=this.cardVal=c.getCardVal();
	}
	//cardVal 내용 
	@Override
	public String toString() {
		return "["+cardVal+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Card cb = (Card) obj;
		if (cardVal.equals(cb.getCardVal())) {
			return true;
		} else {
			return false;
		}
	}
	//(객체 비교) 카드 정렬에서 추가됨
	//static 비교 기준 메소드
					//c1과 c2를 비교함
	public static int compareCard(Card c1, Card c2) {
		//카드 첫번째 값 비교 : H인지 C인지
		//H=72, C=67
		//양수면 순서 바꿈, 음수면 그대로 : c가 먼저 오도록 세팅함
		return c1.getCardVal().compareTo(c2.getCardVal());
	}
	public static int compareRCard(Card c1, Card c2) {
		//카드 첫번째 값 비교 : H인지 C인지
		//양수면 그대로, 음수면 순서 바꿈 : c가 먼저 오도록 세팅함
		return -c1.getCardVal().compareTo(c2.getCardVal());
	}
}
