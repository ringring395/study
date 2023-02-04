package s113;

import java.util.Scanner;

//바카라 메인 클래스
public class BakaraMain {
	public static void main(String[] args) {
		System.out.println("자산을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int asset1 = sc.nextInt();	//최초 자산을 사용자가 직접 입력
		int i = 0;
		Bakara bkr = new Bakara();	//바카라 게임 객체 생성
		while(true) {
			bkr.start();	//바카라 게임 시작
			i++;
			System.out.println(i+"번째 대결입니다.");
			System.out.println("당신의 현재 자산은 총"+asset1+"원입니다.");
			System.out.println("당신이 배팅할 금액을 설정하세요.");
		    //베팅액 입력
			int betting = sc.nextInt();
			if (betting > asset1) {
				System.out.println("자산을 넘어설 수 없습니다. 다시 입력하세요.");
				i--;
			}else {
				asset1 = asset1 - betting;
				System.out.println("당신은 "+betting+"만큼의 금액을 배팅했습니다.");
				System.out.println("당신의 자산은 "+asset1+"입니다.");
				System.out.println("이 금액을 어디에 거시겠습니까");
				System.out.println("1 : Player"); 
				System.out.println("2 : Dealer");
				System.out.println("3 : Tie(무승부)");
				//승부를 걸 쪽 입력
				int guessWin = sc.nextInt();
				switch(guessWin) {
					case 1 : 
						System.out.println("당신은 Player에 걸었습니다.");
						break;
					case 2 : 
						System.out.println("당신은 Dealer에 걸었습니다.");
						break;
					case 3 : 
						System.out.println("당신은 Tie에 걸었습니다.");
						break;
				}
				System.out.println("====<Game Start!>====");
				System.out.println("=====================");						
				bkr.result();	
				System.out.println("=====<배팅 결과!>======");
				System.out.println("=====================");
				//결과 출력
				if (guessWin == bkr.getWhoWin()) {
					System.out.println("당신이 이겼습니다! 축하합니다!");
					asset1 = asset1 + (betting * 2);
				}else if (guessWin == bkr.getWhoWin()) {
					System.out.println("당신이 이겼습니다! 축하합니다!");
					asset1 = asset1 + (betting * 2);
				}else if (guessWin == bkr.getWhoWin()) {
					System.out.println("당신이 이겼습니다! 축하합니다!");
					asset1 = asset1 + (betting * 8);
				}else {
					System.out.println("안됐군요.. 유감입니다.");
				}
				System.out.println("당신의 남은 자산은 " + asset1 + "입니다!");
				System.out.println("---------------------");				
				if (asset1 <= 0) {
					System.out.println("자산이 부족합니다. Bye~");
					break;
				}
			}
		}
	}
}
