package java_study;

import java.util.Scanner;

public class ex2839_sugar {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); // 현재 가진 설탕 N
		int sugar = 0;

		while (true) {
			if (N % 5 == 0) { // 5의 배수면 5키로 설탕 봉지 출력
				sugar += N / 5;
				System.out.println(sugar);
				break;
			} else { 			// 3키로 빼서 한봉지씩 추가함
				N -= 3;		 // 다시 if로 올라가서 5의배수인지 확인
				sugar++;
			}
			if (N < 0) { 	// 3빼다가 음수되면 -1출력함
				System.out.println(-1);
				break;
			}

		} // while 닫음
	}// 메인메소드 닫음

}
