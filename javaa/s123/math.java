package s123;

import java.util.Scanner;

//약수 소인수 분해
public class math {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int div = sc.nextInt();
		//약수
		System.out.println("==약수==");
		//1이면 더 할 필요도 없겟지.
		if(div==1) {
			System.out.println("[1]");
		}else {	//1이 아니면 
			System.out.printf("[1, ");
			//2부터 하나씩 증기시키면서
			for(int i=2; i<div; i++) {
				//입력한 수를 i로 나눠가면서 나눠떨어지는지 확인
				if(div%i==0) {
					System.out.printf("%d, ",i);
				}
			}
			System.out.println(div+"]");
		}
		//소인수
		System.out.println("==소인수==");
		int a=2;	//소수의 최솟값
		//입력한 수가 1이면 찾을 필요도 없음.
		while(div!=1) {
			//입력수가 a로 나눠떨어지면 
			if(div%a==0) {
				//입력수를 a로 나눠서 몫이 1이면
				//div랑 a가 같은 숫자기 때문에
				//소인수 분해 마지막 수가 된다.
				if(div/a==1) {
					System.out.println(a);
				}else {
					System.out.print(a+"x");
				}
				div/=a;
			//입력한 수가 a로 나눠떨어지지 않으면
			}else {
				a++;	//a 증가
			}
		}//while
	}
}
