package s113;
//바카라 족보 만들기
public class CardLaw {
	//플레이어의 세번째 카드를 받는 조건
	public boolean thirdCardPlayer(int x) {	
		boolean isC = false;
		if(x<6) {	//플레이어 카드 2장의 합이 0~5이면
			isC = true;
		}
		return isC;
	}
	//딜러의 세번째 카드를 받는 조건
	public boolean thirdCardDealer(int x, int y) {	
		boolean isC = false;
		if(x<3) {	//딜러 카드 2장 합이 0,1,2 이면
			isC = true;
		}else if(x==3 && y!=8){
			//딜러의 합이 3이고 플레이어 세번째 카드가 8이 아닐때
			isC = true;
		}else if(x==4 && (y>1 && y<8)) {
			//딜러의 합이 4고 플레이어 세번째 카드가 2~7일때
			isC = true;
		}else if(x==5 && (y>3 && y<8)) {
			//딜러의 합이 5이고 플레이어 세번째 카드가 4~7일때
			isC = true;
		}else if(x==6 && (y>5 && y<8)) {
			//딜러의 합이 6이고 플레이어 세번째 카드가 6,7일때
			isC = true;
		}
		return isC;
	}
	//스탠드가 되는 조건
	public boolean stand(int x, int y) {
		boolean isC = false;
		if(x>5 && x<8) {	//플레이어 합이 6,7일때
			if(x==y) {	//플레이어합 == 딜러 합
				isC = true;
			}
			isC = true;
		}else if(y==7) {	//딜러 합이 7일때
			isC = true;
		}
		return isC;
	}
	//예외 처리가 되는 조건
	public boolean natural(int x, int y) {
		boolean isE = false;
		if(x>7 && x<10) {	//플레이어 합이 8,9일때
			isE = true;
		}else if(y>7 && y<10) {//딜러 합이 8,9일때
			isE = true;
		}
		return isE;
	}	
}
