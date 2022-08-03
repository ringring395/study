package java_study;

import java.util.Scanner;
import java.util.Stack;

public class ex9012_ps {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack st = new Stack(); // 스택 사용
		int N = s.nextInt(); // 총 몇번
		String ps = s.next(); // 스택에 괄호 입력

			for (int j = 0; j < ps.length(); j++) {					
				if (ps.charAt(j) == '(') {
					st.push('('); // 여는 괄호면 push
				} else if (ps.charAt(j) == ')') {
					st.pop(); // 닫는 괄호면 pop
				}
				if (st.isEmpty()) {
					// 스택 짝이 다 맞아서 비었으면 yes
					//print.push("yes");
					System.out.println( "yes");
				} else if (!st.isEmpty()) {
					// 스택 짝 안맞으면 no
					//print.push("no");
					System.out.println( "no");
				}
		} // for닫음
	}// 메인메소드 닫음

}
