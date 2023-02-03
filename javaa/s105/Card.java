package s105;

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
}
