package study;
import java.util.Scanner;
public class loop_whilescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 키보드로 데이터를 입력할 수 있게 하는 객체
		Scanner s = new Scanner(System.in);
		//선택번호를 저장하는 변수
		int selectNo;
		//금액을 저장하는 변수
		int money = 0;
		//통장 잔액을 저장하는 변수
		int balance = 0;
		while(true) {	//while 조건식이  true면 무한반복됨.
			System.out.println("﻿---------------------");
			System.out.println("﻿﻿1.예금 2.출금 3.조회 4.종료");
			System.out.println("﻿---------------------");
			System.out.print("선택>");
			//선택번호를 입력할 수 있게 커서 생성(키보드로 입력)
			selectNo = s.nextInt();
			if(selectNo==1) {	//1번일때
				System.out.print("예금액>");
				//예금액을 입력할 수 있게 커서 생성(키보드로 예금액 입력)
				money = s.nextInt();
				balance += money;	//통장잔액에 합산
			}else if(selectNo==2) {	//2번일때
				System.out.print("출금액>");
				//출금액을 입력할 수 있게 커서 생성(키보드로 출금액 입력)
				money = s.nextInt();
				balance -= money;	//통장잔액에 합산
			}else if(selectNo==3) {	//3번일때
				System.out.println("잔고 : "+balance);
			}else if(selectNo==4) {	//4번일때
				System.out.println("프로그램 종료");
				break;	//반복문을 끝내는 키워드.
			}else {
				System.out.println("1~4 중 하나만 선택하세요.");
			}
			
		}

		/*Scanner key1 = new Scanner(System.in);
		System.out.println("1~4번호를 선택하세요.");
		int count = 0;
		int select1;
		while(true) {
			select1 =key1.nextInt();
			int in_num;
			if(select1==1) {
				Scanner num1 = new Scanner(System.in);
				System.out.println("예금액을 입력하세요.");
				in_num =num1.nextInt();
				count += in_num;
				System.out.println("현재 계좌잔액은 "+count+"입니다.");
				System.out.println("1~4번호를 선택하세요.");
			}else if(select1==2) {
				Scanner num1 = new Scanner(System.in);
				System.out.println("출금액을 입력하세요.");
				in_num =num1.nextInt();
				count -= in_num;
				System.out.println("현재 계좌잔액은 "+count+"입니다.");
				System.out.println("1~4번호를 선택하세요.");
			}else if(select1==3) {
				Scanner num1 = new Scanner(System.in);
				System.out.println("현재 계좌잔액은 "+count+"입니다.");
				System.out.println("1~4번호를 선택하세요.");
			}else {
				System.out.println("프로그램 종료");
			}
		}*/
	}

}
