package ex;
import java.util.Scanner;
public class ex_220706 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
	//1. for문을 이용하여 1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보자.
	int sum1 = 0;
	for(int i=3; i<=100; i+=3) {
		//System.out.println(i);
		sum1 += i;
	}System.out.println("3의 배수의 총합 : "+sum1);
	//총합을 저장하는 변수
	int sum = 0;
	//for문을 이용해 1~100까지 정수
	for(int i=1; i<=100; i++) {
		//3의 배수
		if(i%3 == 0) {
			sum += i;	//sum = sum+i;
		}
	}//for문 끝
	System.out.println("3의 배수의 총합 : "+sum);
	
	
	/*2. while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈이
	   아래의 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
	   눈의 합이 5이면 실행을 멈추는 코드는 작성해 보자
	   출력
	   (6,4)
	   (3,6)
	   (6,2)
	   (3,2) */
	while(true) {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		System.out.println("("+dice1+","+dice2+")");
		if(dice1+dice2 ==5) {
			System.out.println("탈출!! 주사위의 합이 드디어 5가 나왔습니다.");
			break;
		}
	}
	int dice11 = 0;
	int dice22 = 0;
	while(dice11+dice22 != 5) { //5가 나오면 false라서 반복문 끝남.
		dice11 = (int)(Math.random()*6)+1;
		dice22 = (int)(Math.random()*6)+1;
		System.out.println("("+dice11+","+dice22+")");
	}System.out.println("탈출!! 주사위의 합이 드디어 5가 나왔습니다.");
	
	
	/*3. 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
	   변수 money의 금액을 각각 지폐와 동전이 몇 개가 필요한지 계산해서 출력하라.
	   (단, 가능한 한 적은 수의 지폐와 동전으로으로 거슬러 주어야 한다.)
	   출력
	   금액  37210
	   만원권  3장
	   오천원권  1장
	   천원권  2장
	   오백원권  0개
	   백원권  2개
	   십원권  1개 */
	//금액을 저장하는 변수
	System.out.println("3_money를 입력하세요");
	int money = in.nextInt();
	//돈 종류를 저장하는 배열
	int[] mm = {50000,10000,5000,1000,500,100,50,10};
	for(int i =0; i<mm.length; i++) {
		System.out.println(mm[i]+"원권 : "+money / mm[i]+"장");
		money%=mm[i];
	}
//	int _50000 = 0;		//5만원권 장수 저장하는 변수
//	int _10000 = 0;		//5만원권 장수 저장하는 변수
//	int _5000 = 0;		//5천원권 장수 저장하는 변수
//	int _1000 = 0;		//1천원권 장수 저장하는 변수
//	int _500 = 0;		//5백원 갯수 저장하는 변수
//	int _100 = 0;		//1백원 갯수 저장하는 변수
//	int _50 = 0;		//5십원 갯수 저장하는 변수
//	int _10 = 0;		//1십원 갯수 저장하는 변수
//	_50000 = money / 50000;
//	_10000 = (money%50000) / 10000;
//	_5000 = (money%50000%10000) / 5000;
//	_1000 = (money%50000%10000%5000) / 1000;
//	_500 = (money%50000%10000%5000%1000) / 500;
//	_100 = (money%50000%10000%5000%1000%500) / 100;
//	_50 = (money%50000%10000%5000%1000%500%100) / 50;
//	_10 = (money%50000%10000%5000%1000%500%100%50) / 10;
//	System.out.println("5만원권 "+_50000+"장");
//	System.out.println("1만원권 "+_10000+"장");
//	System.out.println("5천원권 "+_5000+"장");
//	System.out.println("1천원권 "+_1000+"장");
//	System.out.println("5백원 "+_500+"개");
//	System.out.println("1백원 "+_100+"개");
//	System.out.println("5십원 "+_50+"개");
//	System.out.println("1십원 "+_10+"개");

	
	/*4. 약수를 모두 찾는 수학 문제를 풀다가 지친 X는 컴퓨터의 도움을 받아 문제를 풀어 보기로 하였다.
	   입력
	   24
	   출력
	   { 1, 2, 3, 4, 6, 8, 12, 24}
	   약수의 개수는 8개 입니다.
	   입력
	   36
	   출력
	   { 1, 2, 3, 4, 6, 9, 12, 18, 36 }
	   약수의 개수는 9개 입니다. */

	System.out.print("4_숫자를 입력하세요.");
	int input4 = in.nextInt();		//약수를 구할 숫자 input4에 저장
	int count4 = 1;
	System.out.print("{");			//for문 밖에 해야 반복안됨
	//1부터 입력받은 숫자까지 반복하는 for문
	for(int i=1; i<input4; i++) {
		if(input4 % i == 0) {		//약수 구하기
			System.out.print(i+", "); //한줄로 나열해서 출력
			count4++;
		}			//여기에 마지막 숫자 넣어야 콤마 빠짐
	}System.out.println(input4+"}");	//for문 밖에 해야 반복안됨
	 System.out.println("약수의 개수는 "+count4+"개 입니다.");
//	//if문으로 콤마 떼는 방법
//		if(input4 % i == 0) { 		
//			if(input4==i) {
//				System.out.print(i+"");				
//			}else {
//				System.out.print(i+", ");
//			}count4++;
//		}
	 
	 
	/*5. 홀수와 짝수의 개수를 구하는 프로그램을 만들어라.
	   [3, 4, 5, 6, 7]
	   = 홀수 3개, 짝수 2개
	   [12, 16, 22, 24, 29]
	   = 홀수 1개, 짝수 4개 
	   [41, 43, 45, 47, 49]
	   = 홀수 5개, 짝수 0개 */
	//System.out.println("5_숫자 5개를 입력해주세요");
	//int[] array5 = in.nextInt();
	int[] array5 = {41, 43, 45, 47, 49};
	int even = 0;		//짝수 갯수 저장
	int odd = 0;		//홀수 갯수 저장
	for(int i =0; i<array5.length; i++) {
		if(array5[i]%2 == 0) {		//짝수
			even++;
		}else {						//홀수
			odd++;
		}
	}System.out.println("= 홀수 "+odd+"개, 짝수 "+even+"개");
	
	
	/* 6. 컴퓨터가 생각한 숫자 맞추기
	
	     조건     
	     1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값(임의의 값)을 맞추면 게임이 끝남
	     사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
	     사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
	
	     1과100 사이의 값을 입력하세요 50
	     더 큰 수를 입력하세요.
	     1과100 사이의 값을 입력하세요 75
	     더 큰 수를 입력하세요.
	     1과100 사이의 값을 입력하세요 87
	     더 작은 수를 입력하세요.
	     1과100 사이의 값을 입력하세요 80
	     더 작은 수를 입력하세요.
	     1과100 사이의 값을 입력하세요 77
	     더 작은 수를 입력하세요.
	     1과100 사이의 값을 입력하세요 76
	     맞췄습니다.
	     시도횟수는 번입니다 6 */
	
	//임의의 값을 num6에 저장
	int num6 = (int)(Math.random()*100)+1;
	int input6 = 0;		//사용자 값을 저장
	int count6 = 0;		//시도횟수
	while(true) {
		System.out.print("6_1과 100 사이의 값을 입력해주세요");
		input6 = in.nextInt();		//사용자 값 입력
		count6++;					//입력하는 횟수 올라감.
		
		if(num6 > input6) { //임의의 값이 더 크다면?
			System.out.println("더 큰 수를 입력하세요.");
		}else if(num6 < input6) { //임의의 값이 더 작다면?
			System.out.println("더 작은 수를 입력하세요.");
		}else if(num6 == input6) { //임의의 값과 동일하다면
			System.out.println("맞췄습니다.");
			System.out.println("시도횟수는 "+count6+"번입니다.");
			break;
		}
	}
		 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
