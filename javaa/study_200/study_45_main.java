package study_200;

import java.util.Scanner;

public class study_45_main {
	//for
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 숫자를 입력하세요(for)");
		int temp = sc.nextInt();
		for(;temp!=1;) {
			if(temp%2==1) {	//홀수면
				temp=temp*3+1;
			}else {			//짝수면
				temp/=2;
			}
			System.out.println("["+temp+"]");
		}
	}
}
