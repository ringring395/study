package s105;

public class CardMain2 {
	public static void main(String[] args) {
		//생성자
		Card c1 = new Card("H4");
		Card c2 = new Card("H4");
		//해시코드 출력
		System.out.println(c1.hashCode());
		//Card에서 오버라이딩 했으므로 해시코드 값이 같다
		System.out.println(c2.hashCode());	
		//값 출력
		System.out.println(c1.getCardVal());
		System.out.println(c2.getCardVal());
		//c1과 c2 비교 : 오버라이딩으로 해시코드 값이 동일
		System.out.println(c1.equals(c2));
	}
}
