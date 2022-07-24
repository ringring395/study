package study2;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//import -> 같은 패키지는 묶어서 표현 가능
import java.util.*;
public class random {
	public static void main(String[] args) {
		//컴퓨터가 생각하는 숫자(1~100)
		int com = (int)(Math.random()*100)+1;
		//System.out.println(com);		//랜덤숫자 확인용
		//사용자가 입력한 숫자
		int input = 0;	
		int count = 0;
		while(true) {	//무한반복
			count++;	//if문 안에 넣어도 됨(대신, count=1부터)
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			//try에 문제가 있다면
			try {		//예외처리
			Scanner s = new Scanner(System.in);
			input = s.nextInt();	//정수값만 처리
			}
			//catch에서 잡아내라.
			catch(InputMismatchException e) {
				System.out.println("숫자만 입력할 수 있습니다. 다시 입력하세요>");
				continue;	//건너뛰고 계속 하세요.
			}	//catch닫음
			//finally {
			//랜덤보다 입력숫자가 작을때
			if(input < com) {
				System.out.println("더 큰 수를 입력하세요");
			//랜덤보다 입력숫자가 클때
			}else if(input > com) {
				System.out.println("더 작은 수를 입력하세요");
			//입력숫자 == 랜덤숫자
			}else if(input == com) {
				System.out.println("정답!!");
				System.out.println(count+"번만에 맞추셨습니다.");
				break;	//while반복문 끝냄
			}
			//}//finally닫음
		}//while닫음
		
		
		
		

	}

}
