package java_study;

import java.util.Scanner;
import java.util.Stack;

public class ex11899_insert {
//김수진
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Stack st = new Stack(); // 스택 사용 선언
		int count = 0; // 카운트 변수 선언

		String c = s.next(); // 부러진 괄호입력
		// 입력된 괄호 c 길이만큼 for문 돌림
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == '(') { // 여는 괄호이면 push
				st.push('(');
			} else if (st.empty()) { // 스택에 아무것도 없으면 카운팅
				count++;
			} else { // 닫는 괄호이면 pop
				st.pop();
			}
		} // for 닫음
		System.out.println(count + st.size());// 카운팅이랑 push된 스택길이 더함

	}// 메인메소드 닫음
}
