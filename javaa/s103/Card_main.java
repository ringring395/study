package s103;

public class Card_main {

	public static void main(String[] args) {
		String csuit1="H",cvalu1="6";	//suit+value
		String csuit2="H",cvalu2="3";	//suit+value
		//객체 생성
		//생성자
		Card c1 = new Card("H6");			//H6
		Card c2 = new Card(csuit1+cvalu1);	//H6
		Card c3 = new Card();				//H2, 기본 생성자
		Card c4 = new Card(csuit2+cvalu2);	//H3
		
		System.out.printf("%s,%s,%s,%s\n",c1,c2,c3,c4);
		//c1과 c2가 H6로 값은 같지만, 해시코드가 다르기 때문에 false
		System.out.println(c1.equals(c2));	//false
		//c1과 c2의 값은 H6로 같으므로 true
		System.out.println(c1.getCardVal().equals(c2.getCardVal()));
	}
}
