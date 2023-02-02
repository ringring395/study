package study_200;

import java.util.Scanner;

public class study_52_main {
	//2진수로 바꾸기(문자열 자르기)
	public static String shifts(int a) {
		//10진수를 2진수로 변환
		int bit=1;
		String s="";
		for(int i=0; i<=10; i++) {
			s=(a & bit)+s;
			a>>=1; 
		}			
		return s.substring(s.indexOf('1'));
	}
	public static void main(String[] args) {
		//입력한 10진수를 2진수로 변환
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num+":"+shifts(num));
	}
}
