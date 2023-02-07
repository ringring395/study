package s123;

import java.text.DecimalFormat;
import java.util.Scanner;
//적금 구하기
public class deposit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 납부액을 입력하세요\n> ");
		double money = sc.nextDouble();	//금액
		System.out.print("적금 기간을 입력하세요\n> ");
		int month = sc.nextInt();		//기간
		System.out.print("이자를 입력하세요\n> ");
		double ra = sc.nextDouble();	//금리
		//연이자율을 월 이자율로 바꾸자.
		double ratio = ra/100/12;	
		//합계 변수
		double tot = 0.0;	
		//적금 기간만큼 for문 돌림
		for(int i=0; i<month; i++) {
			//이자 받은 월 금액 구하기
			money = money*(1+ratio);
			//월 금액 누적
			tot+=money;		
		}
		System.out.printf("적금:%.0f\n",tot);
		//천단위 콤마
		DecimalFormat com = new DecimalFormat("#,###");
		String Comtot = (String)com.format(tot);
		System.out.println("적금 : "+Comtot);
	}
}
