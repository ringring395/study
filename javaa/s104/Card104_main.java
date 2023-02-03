package s104;

public class Card104_main {

	public static void main(String[] args) {
		Card104 c1 = new Card104("H4");
		Card104 c2 = new Card104("H4");
		Card104 c3 = new Card104(c1);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.getCardVal());
		System.out.println(c2.getCardVal());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		for(int i=0; i<CardUtil.suit.length; i++) {
			for(int j=0; j<CardUtil.valu.length; j++){
				//값은 같은 수 있어도 해시코드는 고유함
				Card104 c = new Card104();
					System.out.printf("%s\t",c);
			}
			System.out.println();
		}
	}
}
