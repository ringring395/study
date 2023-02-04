package s114;

import java.util.Scanner;

//4배 마방진 메인 클래스
public class fourMagicSquareMain {
	public static void main(String[] args) {
		System.out.println("4의 배수(정수)를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fourMagicSquare four = new fourMagicSquare(n);
		four.make();
		four.print();
	}
}
