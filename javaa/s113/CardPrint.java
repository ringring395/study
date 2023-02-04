package s113;
//바카라 족보 : 출력 클래스
public class CardPrint {
	CardCase cc = new CardCase();	//카드 만들고 저장 객체 생성
	CardLaw law = new CardLaw();	//바카라 족보 객체 생성
	
	private int TotalPlayer;	//플레이어 카드합
	private int TotalDealer;	//딜러 카드합
	//생성자
	public CardPrint() {}	
	public void make(){		//카드 생성
		cc.make();
	}
	public void shuffle(){	//카드 섞기
		cc.shuffle();
	}
	public void print() {	//카드 출력
		System.out.println("<플레이어 카드>");
		System.out.println("1번째 카드 : "+cc.getCards().get(0)+"1번째 카드 수 : "+num(0));
		System.out.println("2번째 카드 : "+cc.getCards().get(1)+"2번째 카드 수 : "+num(1));
		System.out.println("플레이어의 2장의 카드합 : "+sumP());
		TotalPlayer = sumP();	//플레이어 카드 합
		System.out.println("---------------------");
		//플레이어 카드합 확인
		if (law.natural(sumP(), sumD())) {		//예외처리(natural)인지 확인
			System.out.println("예외처리로 바로 겨룹니다!");
			TotalPlayer = sumP();
		}else if (law.stand(sumP(), sumD())) {	//스탠드인지 확인
			standPrintPl();	//플레이어 스탠드 메소드 호출
		}else if (law.thirdCardPlayer(sumP())) {//3번째카드 받는지 확인
			System.out.println("3 번째 카드를 받습니다!");
			System.out.println("3 번째 카드 : "+cc.getCards().get(4)+"3 번째 카드 수 : "+num(4));
			System.out.println("---------------------");
			System.out.println("플레이어의 총 카드 합 : "+total(sumP(), num(4)));
			TotalPlayer = total(sumP(), num(4));
		}
		System.out.println("=====================");	
		System.out.println("<딜러 카드>");
		System.out.println("1번째 카드 : "+cc.getCards().get(2)+"1번째 카드 수 : "+num(2));
		System.out.println("2번째 카드 : "+cc.getCards().get(3)+"2번째 카드 수 : "+num(3));
		System.out.println("딜러의 2장의 카드합 : "+sumD());
		TotalDealer = sumD();	//딜러 카드합
		System.out.println("---------------------");
		//딜러 카드합 확인	
		if (law.natural(sumP(), sumD())) {		//예외처리(natural)인지 확인
			System.out.println("예외처리로 바로 겨룹니다!");
			TotalDealer = sumD();
		}else if (law.stand(sumP(), sumD())) {	//스탠드인지 확인
			standPrintDl();	//딜러 스탠드 메소드 호출
		}else if (law.thirdCardDealer(sumD(), num(4))) {//3번째 카드 받는지 확인
			System.out.println("3 번째 카드를 받습니다!");
			System.out.println("3 번째 카드 : "+cc.getCards().get(5)+"3 번째 카드 수 : "+num(5));
			System.out.println("---------------------");
			System.out.println("딜러의 총 카드 합 : "+total(sumD(), num(5)));
			TotalDealer = total(sumD(), num(5));
		}
		System.out.println("=====================");
	}
	//플레이어 스탠드 메소드 선언
	public void standPrintPl() {
		System.out.println("스탠드 입니다.");
		if (sumP() > 5 && sumP() < 8) {	//플레이어 스탠드 = 플레이어 카드합이 6,7일때,
			if (sumD() < 6 ) {	//딜러 카드합이 0~5이면
				System.out.println("딜러는 3번째 카드를 받습니다.");
			}else {		//딜러 카드합이 6이상이면
				System.out.println("바로 겨룹니다!");
				TotalPlayer = sumP();
			}
		}else if (sumD() == 7 ) {	//딜러 카드합이 7일때,
			if (sumP() < 6) {		//플레이어 카드합이 0~5이면
				System.out.println("3 번째 카드를 받습니다!");
				System.out.println("3 번째 카드 : "+cc.getCards().get(4)+"3 번째 카드 수 : "+num(4));
				System.out.println("---------------------");
				System.out.println("플레이어의 총 카드 합 : "+total(sumP(), num(4)));
				TotalPlayer = total(sumP(), num(4));
			}else {
				System.out.println("바로 겨룹니다.");
				TotalPlayer = sumP();				
			}
		}
	}
	//딜러 스탠드 메소드 선언
	public void standPrintDl() {
		System.out.println("스탠드 입니다.");
		if (sumP() > 5 && sumP() < 8) {	//플레이어 스탠드 = 플레이어 카드합이 6,7일때,
			if (sumD() < 6 ) {	//딜러 카드합이 0~5이면
				System.out.println("3 번째 카드를 받습니다!");
				System.out.println("3 번째 카드 : "+cc.getCards().get(5)+"3 번째 카드 수 : "+num(5));
				System.out.println("---------------------");
				System.out.println("딜러의 총 카드 합 : "+total(sumD(), num(5)));
				TotalDealer = total(sumD(), num(5));
			}else {
				System.out.println("바로 겨룹니다!");
				TotalDealer = sumD();
			}
		}else if (sumD() == 7 ) {	//딜러 카드합 7일때,
			if (sumP() < 6) {	//플레이어 카드합이 0~5이면
				System.out.println("플레이어는 3번째 카드를 받습니다.");
			}else {
				System.out.println("바로 겨룹니다.");
				TotalDealer = sumD();
			}
		}
	}
	//카드값 구하기
	public int num(int n) {
		int num;
		Card str = cc.getCards().get(n);
		char ch = str.getCardVal().charAt(1);//H3				
		switch (ch) {
			case 'A' : 
				num = 1;
				break;
			case 'T' : 
			case 'J' : 
			case 'Q' : 
			case 'K' : 
				num = 0; 
				break;	//fall through
			default : 
				num=ch-'0';
				break;	//'9'-'0'
		}
		return num;
	}
	//플레이어 카드합의 1의 자릿수
	public int sumP() {
		int sumP = 0;
		for (int i = 0; i < 2; i++) {
			sumP += num(i);
			if (sumP > 9) {
				sumP -= 10;	//1의 자리수
			}			
		}
		return sumP;
	}
	//딜러 카드합의 1의 자릿수
	public int sumD() {
		int sumD = 0;
		for (int i = 2; i < 4; i++) {
			sumD += num(i);
		}
		return sumD%10;
	}
	public int total(int x, int y){
		return (x+y)%10;
	}
	//플레이어 값
	public int returnPlayer() {
		return TotalPlayer;
	}
	//딜러 값
	public int returnDealer() {
		return TotalDealer;
	}	
}