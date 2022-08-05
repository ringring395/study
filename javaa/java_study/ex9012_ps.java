package java_study;

import java.util.Scanner;
import java.util.Stack;

public class ex9012_ps {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); // 총 몇번
		String[] ps = new String[N]; // 괄호를 입력받는 배열(길이는 N)
		Stack st = new Stack(); // 스택 사용 선언
		

		for (int i = 0; i < N; i++) { // 입력한 수만큼 아래 for문 돌림
			ps[i] = s.next(); // 배열에 괄호를 입력받음

			for (int j = 0; j < ps[i].length(); j++) {// 괄호를 하나씩 분석

				if (ps[i].charAt(j) == '(') { // 여는괄호인가요?
					st.push(3); // 여는 괄호면 push
				} else if (ps[i].charAt(0) == ')') {
					st.push(333);
				} else {
					st.pop(); // 닫는 괄호면 pop
				}
			} // j_for문 닫음
		if (st.isEmpty()) { // 스택 짝이 다 맞아서 비었으면 yes
			System.out.println("yes");
		}else if (!st.isEmpty()) { // 스택 짝 안맞으면 no
			System.out.println("no");
		}
		} // i_for닫음
	}// 메인메소드 닫음
}
