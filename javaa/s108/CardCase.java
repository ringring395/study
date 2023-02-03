package s108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import s107.CardRomp;

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
		Comparator<Card> cmp = new Comparator<Card>() {
			@Override
			public int compare(Card c1, Card c2) {
				return c1.getCardVal().compareTo(c2.getCardVal());
			}
		};
		cards.sort(cmp);
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
				(c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());
		});
	}
	//역순 정렬을 Lambda로 구현
	public void lambdarsort() {
		cards.sort(
				(c1,c2)->{return -c1.getCardVal().compareTo(c2.getCardVal());
		});
	}	
}
