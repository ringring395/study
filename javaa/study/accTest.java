package study;
import java.util.ArrayList;
import java.util.Scanner;
public class accTest {
	public static void main(String[] args) {
		ArrayList<acc> ac = new ArrayList<>();
		acc acc = new acc();
		Scanner s = new Scanner(System.in);
		int select = 0;
		
		while(true) {
			System.out.println("===============");
			System.out.println("﻿1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료|");
			System.out.println("===============");
			System.out.print("선택>");
			select = s.nextInt();
		if(select==1) {
			//계좌생성하기 호출 create
			//선언부에 다 입력하고 입력된값을
			//호출부에 불러서 메인에서 동적배열에 저장하면됨
		}else if(select==2) {
			//계좌목록보기 호출 numlist
		}else if(select==3) {
			//예금하기 호출 deposit & numcheck(동일계좌검색)
		}else if(select==4) {
			//출금하기 호출 withdraw & numcheck(동일계좌검색)
		}else if(select==5) {
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("1~5번 중에 선택해주세요.");
		}
			
		}//while닫음

		
	}//메인메소드 닫음
}//accTest닫음
