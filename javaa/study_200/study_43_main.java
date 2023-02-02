package study_200;

import java.util.Scanner;

public class study_43_main {

	public static void main(String[] args) {
		//1이 될때까지 나누고 곱하기
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 숫자를 입력하기(while)");
		int temp = sc.nextInt();
		while(temp!=1) {	//1이 아니면,
			if(temp%2==1) {	//홀수면
				temp = temp*3+1;
			}else {	//짝수면
				temp/=2;
			}
			System.out.println("["+temp+"]");
		}		
	}
}
