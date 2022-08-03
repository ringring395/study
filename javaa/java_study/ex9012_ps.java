package java_study;

import java.util.Scanner;
import java.util.Stack;

public class ex9012_ps {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack st = new Stack(); // 스택 사용
		int N = s.nextInt(); // 총 몇번
		String ps = s.next(); // 스택에 괄호 입력
		Stack result = new Stack();	//결과 저장 스택

		for (int i = 0; i < N; i++) {	
			if(ps.charAt(i)==')'{		//닫는 괄호이면 다시 if문돌림
				for(int j=0; i<N; i++) {
					if(ps.charAt(j)==')') {	//동시에 여는괄호를 만났다?
						st.push("co");
					}
				}
			}
		}
			for (int j = 0; j < ps.length(); j++) {	
				if (ps.charAt(j) == '(') {
					st.push('('); // 여는 괄호면 push
				} else if (ps.charAt(j) == ')') {
					st.pop(); // 닫는 괄호면 pop
				}
				if (st.isEmpty()) {
					// 스택 짝이 다 맞아서 비었으면 yes
					//print.push("yes");
					result = "yes";
				} else if (!st.isEmpty()) {
					// 스택 짝 안맞으면 no
					//print.push("no");
					result = "no";
				}
				//	} // for 닫음
			System.out.println(result);
		} // for닫음
	}// 메인메소드 닫음

}
