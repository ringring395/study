package s113;
//바카라 게임 클래스
public class Bakara {
	CardPrint cp = new CardPrint();
	int whoWin=-1;
	public void start() {
		cp.make();		//카드 만들기
		cp.shuffle();	//카드 초기화
	}
	//승자 확인
	public void result() {
		whoWin = -1;
		cp.print();		//바카라 게임 출력(족보)
		System.out.println("결과:");
		System.out.println("*****************");
		System.out.println("플레이어 : "+cp.returnPlayer());	//플레이어 값
		System.out.println("딜러 : "+cp.returnDealer());		//딜러 값
		//플레이어와 딜러값 비교
		if(cp.returnPlayer() < cp.returnDealer()) {
			System.out.println("딜러 Win!!");
			whoWin = 2;	//딜러 이기면 2 저장
		}else if(cp.returnPlayer() > cp.returnDealer()) {
			System.out.println("플레이어 Win!!");
			whoWin = 1;	//플레이어 이기면 1 저장
		}else {
			System.out.println("무승부");
			whoWin = 3;	//무승부면 3 저장
		}
	}
	//승자 값을 반환
	public int getWhoWin() {
		return whoWin;
	}
}
