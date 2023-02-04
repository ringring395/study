package s111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardCase {
	//aggregation : CardCase는 Card로 구성
	private List<Card> cards = new ArrayList<Card>();
	public CardCase() {
		cards.clear(); 		//내용 지우기	
	}
	//List 반환
	public List<Card> getCards(){
		return cards;
	}
	//List에 저장된 Card 개수
	public int count() {
		return cards.size();	//저장된 Card 개수
	}
	//List의 index번째 Card
	public Card getCard(int index) {
		return cards.get(index);
	}
	//서로 다른 카드 20장 만들기
	public void make() {
		cards.clear();		//내용지우기
		int suit = CardUtil.suit.length;	//2
		int valu = CardUtil.valu.length;	//10
		int count = 0;
		//서로 다른 20개 카드 만들기
		while(count!=valu*suit) {	//20장이 될때까지
			Card c = new Card();	//임의의 카드 만들기
			if(!cards.contains(c)) {	//contains -> equals 이용해 비교
				cards.add(c);		//같은 객체가 아니라면 저장
				count++;
			}
		}
	}
	//카드 섞기
	public void shuffle() {
		Collections.shuffle(cards);		
	}
	//카드 출력
	public void print() {
		int valu = CardUtil.valu.length;
		for(int i=0; i<cards.size(); i++) {
			Card c = cards.get(i);
			System.out.printf("%s",c.toString());
			if((i+1)%valu==0) {
				System.out.println();
			}
		}
	}
	//정렬
	public void sort() {
							 //new 인터페이스(){메소드( )}
		Comparator<Card> cmp = new Comparator<Card>() {
			@Override
			public int compare(Card c1, Card c2) {
				return c1.getCardVal().compareTo(c2.getCardVal());
			}
		};
		cards.sort(cmp);	//카드 리스트 정렬
	}	
	//역순 정렬
	public void rsort() {
		//익명
		cards.sort(new Comparator<Card>() {
			@Override
			public int compare(Card c1, Card c2) {
				return -c1.getCardVal().compareTo(c2.getCardVal());
			}		
		});
	}
	//정렬을 Lambda로 구현
	public void lambdasort() {
		cards.sort(
				//람다에서는 클래스,메소드,식별자 등 없이 사용해도 어떤 메소드인지 알 수있다.
				//Card c1에서 Card 생략해도 됨
				//( )와 { }사이에 -> 넣어주면 됨
				(c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());
		});
	}
	//정렬을 Lambda로 구현 2
	public void lambdasort2() {
		cards.sort(Comparator.comparing(Card::getCardVal));	//comparing
	}
	//정렬을 Lambda로 구현3
	public void lambdasort3() {
		cards.sort(Card::compareCard);	//static
	}
	//역순 정렬을 Lambda로 구현
	public void lambdarsort() {
		cards.sort(
				(c1,c2)->{return -c1.getCardVal().compareTo(c2.getCardVal());
		});
	}
	//역순 정렬을 Lambda로 구현 2
	public void lambdarsort2() {
		Comparator<Card> mycard = (c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());};
		cards.sort(mycard.reversed());
		//아래와 동일
//		Comparator<Card> mycard = new Comparator<Card>() {
//			@Override
//		public int compare(Card c1, Card c2) {
//				return c1.getCardVal().compareTo(c2.getCardVal());
//			}
//		}
	}
	//역순 정렬을 Lambda로 구현3
	public void lambdarsort3() {
		cards.sort(Card::compareRCard);	//static
	}
}
