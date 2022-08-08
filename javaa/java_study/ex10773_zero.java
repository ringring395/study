package java_study;

import java.util.Scanner;
import java.util.Stack;

public class ex10773_zero {
//김수진
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);	//스캐너 사용 선언
		int size = s.nextInt();				//스택 입력값의 길이
		Stack<Integer> st = new Stack<>();	//스택 사용 선언
		int result = 0;		//결과값 저장
		
		for(int k=0; k<size; k++) {		//스택의 길이만큼 for문 돌림
			int input = s.nextInt();	//키보드 입력값
			if(input !=0 ) {			//키보드 값이 0이 아니면 push
				st.push(input);
			}else {						//키보드 값이 0이면 pop
				st.pop();
			}
		}//for닫음		
		//for문 끝나면 while문 진행
		while(true) {
			if(!st.isEmpty()) {			//스택이 빈게 아니면 값을 계속 더함
				result += st.pop();
			}else {						//스택이 비었으면 출력하고 while문 탈출
				System.out.println(result);	
				break;
			}
		}//while 닫음	

		
		
	}
}
