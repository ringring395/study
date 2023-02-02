package study_200;

import java.util.Scanner;

public class study_49_main {
	//소수 판별하기
	public static boolean prime(int num) {
		boolean numchk = true;
		for(int i=2; i<=(int)Math.sqrt(num); i++) {
			if(num%i==0) {
				numchk = false;
				break;
			}
		}
		return numchk;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();	//입력한 숫자
		boolean primechk = prime(inputnum); //소수판별 클래스
		
		if(primechk) {
			System.out.printf("%d:1과 자신으로만 나눠떨어지는 소수이다",inputnum);
		}else {
			System.out.printf("%d:소수가 아니다",inputnum);
		}
	}
}
