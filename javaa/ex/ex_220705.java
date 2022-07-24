package ex;

import java.util.Scanner;

public class ex_220705 {

	public static void main(String[] args) {
		/*		
		시저암호 코딩하기
		 조건  - 
		입력한 값을 받아 그 문장을 암호화하기 (+3만큼)
		할 수 있으면 복호화까지(복호화는 -3)
		ex) 암호화 : a b c d ... x y z =>  d e f g ... a b c
     	복호화 : a b c d e f g ... => x y z a b c d ...
		힌트 - 아스키코드, Scanner 이용 */

		//암호화
		Scanner in = new Scanner(System.in);
		System.out.println("입력하세요.");
		String input =in.next();
		String answer ="";
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);	//String 문자열에서 한글자씩 받음.
			if(ch>=65&&ch<=87 || ch>=97&&ch<=119) {
				ch += 3;
			}else if (ch>=88&&ch<=90 || ch>=120&&ch<=122) {
				ch -= 23;				
			}
			answer +=ch;
		}
		System.out.println(answer);
		
		//복호화
		String dec = "";
		for(int i=0; i<answer.length(); i++) {
			char ch = answer.charAt(i);
			if(ch>=68&&ch<=90 || ch>=100&&ch<=122) {
				ch -=3;
			}else if(ch>=65&&ch<=67 || ch>=97&&ch<=99) {
				ch +=23;
			}
			dec += ch;
		}
		System.out.println(dec);
	}

}
