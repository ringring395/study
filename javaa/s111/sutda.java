package s111;

import java.util.Scanner;

//섯다 게임
public class sutda {
	CardCase cc = new CardCase();	//카드 저장
	CardRule rule = new CardRule();	//2장의 카드를 받아서 계산
	Card[] cc1 = new Card[CardUtil.sutda];
	Card[] cc2 = new Card[CardUtil.sutda];
	
	public sutda() {
		cc.make();//카드 만들기
	}
	//4장 : 2장씩 패돌림
	private void divide() {
		for(int i=0; i<CardUtil.sutda; i++) {
			cc1[i]=cc.getCard(i);	//0,1
			cc2[i]=cc.getCard(i+CardUtil.sutda);	//2,3
		}
	}
	//4장 : 1장씩 패돌림
	public void divide2() {
		for(int i=0,j=0; i<cc1.length; i++,j+=2) {
			cc1[i]=cc.getCard(j);	//0,2
			cc2[i]=cc.getCard(j+1);	//1,3
		}
	}
	public void play() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to CardGame!!");
		System.out.println("Start!!");
		String ss="N";
		do {
			cc.shuffle();	//카드 섞기
			//divide();		//4장 : 2장씩 패돌림
			divide2();		//4장 : 1장씩 패돌림
			int v1 = rule.rule(cc1[0], cc1[1]);	//족보를 이용해 값 구하기
			int v2 = rule.rule(cc2[0], cc2[1]);	//족보를 이용해 값 구하기
			if(v1 > v2) {
				System.out.println("You WIN!!");
			}else if(v1 < v2) {
				System.out.println("You LOSE!!");
			}else {
				System.out.println("SAME!");
			}
			//카드 종류와 값을 출력
			cc.print();		//테스트용-훔쳐보기
			System.out.println("===결과 확인하기===");
			System.out.println("You "+cc1[0]+" "+cc1[1]);
			System.out.println("점수 : "+rule.rule(cc1[0], cc1[1]));
			System.out.println("COM "+cc2[0]+" "+cc2[1]);
			System.out.println("점수 : "+rule.rule(cc2[0], cc2[1]));
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Do U want to replay again??(Y/N)");
			ss = sc.next();
		}while((ss.toUpperCase()).equalsIgnoreCase("Y"));	//한번 더 플레이
		System.out.println("Bye~~");
	}	
}