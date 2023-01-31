package study_200;

import java.util.Scanner;

public class study_41_main {
	public static void main(String[] args) {
		//스캐너로 년도 입력할 수 있게 함.
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력해봅시다.");
		int year = sc.nextInt();
		boolean result = false;	//결과의 기본값은 거짓
		//4의 배수인데 		100의 배수는 아니고, 		400의 배수
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			result = true;
		}
		System.out.println(result);
		sc.close();
	}
}
