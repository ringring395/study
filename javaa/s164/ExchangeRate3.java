package s164;

import java.util.Scanner;
//환전하기
public class ExchangeRate3 {
	public static void main(String[] args) {
		//입력 조건에 따라 + if문
		System.out.println("환전 : 입력 조건에 따라 + if문");
		double USD = 1270.00;	//1달러당 원화
		double JPY = 9.58;		//1엔당 원화
		double EUR = 1356.81;	//1유로당 원화
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요 > ");		
		double krw3 = sc.nextDouble();	//원화 입력
		System.out.println("미국달러는 1, 일본엔화는 2, 유로화는 3");
		System.out.println("원하는 나라의 숫자를 입력하세요. ");
		int choice = sc.nextInt();	//환전 대상국가 입력
		System.out.println("==========");
		double result3 = 0.0;
		if(choice==1) {
			result3 = cal3(krw3,USD);
			System.out.printf("한화 %.2f원은 미국 달러로 %.2f달러입니다.\n",krw3,result3);
		}else if(choice==2) {
			result3 = cal3(krw3,JPY);	
			System.out.printf("한화 %.2f원은 일본 엔화로 %.2f엔입니다.\n",krw3,result3);			
		}else if(choice==3) {
			result3 = cal3(krw3,EUR);	
			System.out.printf("한화 %.2f원은 유로화로 %.2f유로입니다.\n",krw3,result3);
		}else {
			System.out.println("환전할 수 없습니다.");
		}
	}
	public static double cal3(double krw3, double exchangeRatio) {
		return krw3/exchangeRatio;
	}
}
