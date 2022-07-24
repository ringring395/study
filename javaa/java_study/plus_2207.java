package java_study;

import java.util.ArrayList;
public class plus_2207 {

	public static void main(String[] args) {
		int N = (int)(Math.random()*100);
		System.out.println(N);
		int plusN = 0;
		int count = 0;
//먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.	
//그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
		ArrayList<Integer> num = new ArrayList<>();
		num.add(N);
//		26부터 시작한다. 
		//2+6 = 8이다. 
		plusN = N/10 + N%10;
		//새로운 수는 68이다. 
		num.add(N%10*10 + plusN);
		//6+8 = 14이다. 
		
		//새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.	
		
		plus2 = N%10 + plus1%10
		plus3 = plus1%10 + plus2%10
		plus4 = plus2%10 + plus3%10
			if(N == plus4) {
				System.out.println(count);
				break;
			}
		while(true) {
			count++;
			if(N != plusN) {
				plusN = N/10 + N%10;
				System.out.println(plusN);
			}else if(N == plusN) {
				System.out.println(count);
				break;
			}
			if()
		} //while 닫음
		

		System.out.println(plusN);		
		
		
		
		
		
		

	}

}
