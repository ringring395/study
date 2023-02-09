package s164;

import java.util.Scanner;
//환전하기
public class ExchangeRate {
	public static void main(String[] args) {
		System.out.println("환전 : 변수, 상수 이용");
		//변수 상수 이용
		final double USD = 1270.00;	//1달러당 원화
		final double JPY = 9.58;	//1엔당 원화
		//환전할 금액
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요 > ");
		double krw = sc.nextDouble();	//원화 입력
		System.out.println("==========");
		double resultUSD = krw/USD;	//달러환전 연산
		System.out.printf("한화 %.2f원은 미국 달러로 %.2f달러입니다.\n",krw,resultUSD);
		double resultJPY = krw/JPY;	//엔화환전 연산
		System.out.printf("한화 %.2f원은 일본 엔화로 %.2f엔입니다.\n",krw,resultJPY);
	}
}
