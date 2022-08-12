import java.util.Scanner;
import java.util.Stack;

/*
 * 자바에선 class 이름은 대문자로 시작 (이유 : 객체 선언 시 대문자가 아니라면 안됨)
 */
public class Ex9012_ps {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); // 총 몇번
		/*
		 * 메서드 사용할 때는 객체를 만들어서 사용 (static 은 전역 변수 라서 객체지향언어에 어울리지 않음)
		 */
		Ex9012_ps ps = new Ex9012_ps();

		for (int i = 0; i < N; i++) { // 입력한 수만큼 아래 for문 돌림
			System.out.println(ps.solve(s.next()));
		}

		/*
		 * Scanner 닫아주기
		 */
		s.close();
	}// 메인메소드 닫음

	public String solve(String ss) {
		Stack<Character> st = new Stack<>(); // 스택 사용 선언

		for (int i = 0; i < ss.length(); i++) {// 괄호를 하나씩 분석
			char c = ss.charAt(i); // 배열에 괄호를 입력받음
			if (c == '(') { // 여는괄호인가요?
				st.push(c); // 여는 괄호면 push
			} else if (st.isEmpty()) {
				return "no";
			} else {
				st.pop();
			}
		} // for문 닫음

		if (st.isEmpty()) { // 스택 짝이 다 맞아서 비었으면 yes
			return "yes";
		} else { // 스택 짝 안맞으면 no
			return "no";
		}
	} // if닫음
}
