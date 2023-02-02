package study_200;

import java.util.ArrayList;
import java.util.List;

public class study_58_main {
//홀수들 제곱 합 구하기
	public static void main(String[] args) {
		List<Integer> aa = new ArrayList<>();
		int num=0;
		for(int i=1; i<=10; i++) {
			aa.add(i);
		}
		for(int m:aa) {
			if(m%2==1) {
				num+=m*m;
				System.out.printf("%d\t",m*m);
			}
		}
		System.out.println();
		System.out.println("1~10의 홀수의 제곱합:"+num);
	}
}
