package s104;

public class Card104 {
	private String cardVal;	//H8, H6
	//멤버 접근 메소드
	public String getCardVal() {
		return cardVal;
	}
	//기본 생성자 - 멤버 초기화
	public Card104() {
		//0~3
		int suit=(int)(Math.random()*CardUtil.suit.length);
		//0~12
		int valu=(int)(Math.random()*CardUtil.valu.length);
		//임의 카드값을 갖는다. H6, H8...
		cardVal=CardUtil.suit[suit]+CardUtil.valu[valu];
	}
	//테스트용
	public Card104(String s) {
		this.cardVal=s;		//문자열은 값 복사
	}
	//복사 생성자
	public Card104(Card104 c) {	//다른 카드의 카드값만 가져옴
		this(c.getCardVal());	//=this.cardVal=c.getCardVal();
	}
	//cardVal 내용 
	@Override
	public String toString() {
		return "["+cardVal+"]";
	}
}
