package study_200;

import java.util.Scanner;

public class study_44_main {
	//do~while
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 숫자를 입력하세요");
		System.out.println("do~while");
		int temp = sc.nextInt();
		do {
			if(temp%2==1) {	//홀수면
				temp=temp*3+1;
			}else {			//짝수면
				temp/=2;
			}
			System.out.println("["+temp+"]");
		}while(temp!=1);
	}

}
