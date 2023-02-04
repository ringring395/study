package s114;

import java.util.Scanner;
//6 마방진 메인 클래스
public class sixMagicSquareMain {
	public static void main(String[] args) {
		System.out.println("6, 10, 14 정수(4n+2)를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sixMagicSquare six = new sixMagicSquare(n);
		six.make();
		six.print();
	}
}
