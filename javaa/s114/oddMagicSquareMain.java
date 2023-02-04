package s114;

import java.util.Scanner;

//홀수 마방진 메인 메소드
public class oddMagicSquareMain {
	public static void main(String[] args) {
		System.out.println("홀수 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();		
		oddMagicSquare odd = new oddMagicSquare(n);
		odd.make();
		odd.print();
	}
}
