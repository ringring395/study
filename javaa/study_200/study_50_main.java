package study_200;

import java.util.Scanner;

public class study_50_main {
	//2진수로 바꾸기(shift)
	public static String shifts(int a) {
		//10진수를 2진수로 변환
		String s="";
		for(int i=0; i<=10; i++) {
			int aa=a%2;
			s=(aa>=0)? aa+s : (-aa)+s;
			a>>=1; 
		}			
		return s;
	}
	public static void main(String[] args) {
		//입력한 10진수를 2진수로 변환
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num+":"+shifts(num));
	}
}
