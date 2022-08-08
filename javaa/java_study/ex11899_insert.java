package java_study;

import java.util.Scanner;
import java.util.Stack;

public class ex11899_insert {
//김수진
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String ps = s.next(); // 부러진괄호입력
		Stack st = new Stack();
		int result = 0;

		for (int i = 0; i < ps.length(); i++) {
			if (ps.charAt(i) == '(') {
				st.push('(');
				if (ps.charAt(i + 1) == ')') {
					st.pop(); // 먼저 넣은 ( pop
				}
			} else {
				st.push(')');
			}
		} // for 닫음
			//st.elementAt(j).equals('(')) 
		System.out.println(st);
		System.out.println(st.size());

	}
}
