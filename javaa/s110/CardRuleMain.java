package s110;

//섯다 게임 메인 클래스
public class CardRuleMain {
	public static void main(String[] args) {
		CardCase cc = new CardCase();	//카드 저장
		cc.make();						//카드 생성
		CardRule rule = new CardRule();	//족보
		//0~4까지 5번
		for(int i=0; i<5; i++) {
			System.out.println("====");
			cc.shuffle();				//카드 섞기
			cc.print();
			//0,2는 한장 주고 한장받고 형식으로 패돌린 거임
			int a = rule.rule(cc.getCard(0), cc.getCard(2));
			int b = rule.rule(cc.getCard(1), cc.getCard(3));
			System.out.println(cc.getCard(0)+" "+cc.getCard(2)+" "+a);
			System.out.println(cc.getCard(1)+" "+cc.getCard(3)+" "+b);
		}
		System.out.println("----");
	}
}
