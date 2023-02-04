package s110;

//섯다 게임 :  족보 만들기
public class CardRule {
/*
 * C3C8			3000	38광땡
 * C1C3	C1C8	2000
 * CTST	x100	1000
 * CXSX	x100	X00
 * C1S2	C2S1	99	알리
 * C1S4	S1C4	98	독사
 * C1S9	S9C1	97	삥
 * C1ST	STC1	96	장삥
 * CTS4	STC4	95	장사
 * C4S6	S4C6	94	세륙
 * 끗	X	10
 * */
	public int toV(Card c) {
		int count=0;
		switch(c.getCardVal().charAt(1)) {
		case'A':	//카드에는 A가 있는데
			count=1;	//이건 1로 변환
			break;
		case'T':	//카드에는 T가 있는데
			count=10;	//이건 10으로 변환
			break;
		default:	//나머지는 카드의 인덱스1번값-0을 가져옴(숫자 그대로 가져온다는 뜻)
			count=c.getCardVal().charAt(1)-'0';
			break;	
		}
		return count;
	}
	// 광 suit C
	public boolean isLight(Card c) {
		boolean isL = false;
		//카드 첫번째 값이 C면 일단 광땡 대상임
		if(c.getCardVal().charAt(0)=='C') {
			isL=true;
		}
		return isL;
	}
	// 광(C)면서 valu가 1,3,8 -> C1,C3,C8
	private boolean is138(Card c) {
		boolean isC = false;
		//첫번째 값이 C이면서
		if(isLight(c)) {
			//1,3,8 중에 하나면 광땡!!
			if(c.getCardVal().charAt(1)=='1'||
					c.getCardVal().charAt(1)=='3'||
					c.getCardVal().charAt(1)=='8') {
				isC = true;
			}
		}
		return isC;
	}
	//광땡일때 광땡 값 구함
	//이차원 방적식을 이용 : 더해서 11, 곱해서 24 -> 3,8
	public int rule(Card c1, Card c2) {
		int count=0;
		//광 처리1,3,8
		if(is138(c1) && is138(c2)) {	//C1,C3,C8 = 광
			//38광땡 = 3000
			if((toV(c1)*toV(c2)==24) && (toV(c1)+toV(c2)==11)) {	//3,8
				count = 3000;
				//13광땡 = 2000
			}else if((toV(c1)*toV(c2)==3) && (toV(c1)+toV(c2)==4)) {	//1,3
				count = 2000;
				//18광땡 = 2000
			}else if((toV(c1)*toV(c2)==8) && (toV(c1)+toV(c2)==9)) {	//1,8
				count = 2000;
			}
		}else {
			//땡처리 = 숫자가 같으면 땡임
			//3땡, 4땡
			if((toV(c1)==toV(c2))) {	//10,10 -> 1000
				count = toV(c1)*100;	//땡은 숫자에 곱하기 100
			}else {
				//낫땡(땡아님)
				if((toV(c1)*toV(c2)==2) && (toV(c1)+toV(c2)==3)) {	//1,2 알리
					count = 99;
				}else if((toV(c1)*toV(c2)==4) && (toV(c1)+toV(c2)==5)) {	//1,4 독사
					count = 98;
				}else if((toV(c1)*toV(c2)==9) && (toV(c1)+toV(c2)==10)) {	//1,9 삥
					count = 97;
				}else if((toV(c1)*toV(c2)==10) && (toV(c1)+toV(c2)==11)) {	//1,10 장삥
					count = 96;
				}else if((toV(c1)*toV(c2)==40) && (toV(c1)+toV(c2)==14)) {	//4,10 장사
					count = 95;
				}else if((toV(c1)*toV(c2)==24) && (toV(c1)+toV(c2)==10)) {	//4,6 세륙
					count = 94;
				}else {	//끗 = 그외 나머지
					//카드 숫자를 더해서 일의 자리에 곱하기 10
					count = ((toV(c1)+toV(c2))%10)*10;
				}
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
