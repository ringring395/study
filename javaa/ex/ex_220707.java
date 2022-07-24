package ex;

import java.util.Scanner;

public class ex_220707 {

	public static void main(String[] args) {
		//종합문제 복습
		
		//1번
	int sum = 0;
	for(int i=1; i<=100; i++) { //1~100범위
		if(i%3 == 0) {			//3의배수면?
			sum += i;
		}
	}System.out.println("1~100, 3의배수의 총합="+sum);
		
		//2번
	while(true) {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		System.out.println("("+num1+","+num2+")");
		if(num1+num2==5) {
			System.out.println("주사위 합이 5입니다.");
			break;
		}//if문 닫음
	}//while문 닫음
		
	//3번
	Scanner in = new Scanner(System.in);
	System.out.println("3_금액을 입력하세요");
	int money = in.nextInt();
	int[] array = {50000,10000,5000,1000,500,100,50,10};
	for(int i=0; i<array.length; i++) {
		if(array[i]>=1000) {
			System.out.println(array[i]+"원권 "+money/array[i]+"장");
			money = money%array[i];
		}else if(array[i]<1000) {
		System.out.println(array[i]+"원짜리 "+money/array[i]+"개");
		money = money%array[i];
		}//else if닫음
	} //for닫음

	//4번
	System.out.println("4_약수를 구할 숫자를 입력하세요");
	int num4 = in.nextInt();
	int count4 = 0;
	System.out.print("{");
	for(int i=1; i<=num4; i++) {
		if(num4 % i == 0) {
			if(num4 == i) {
			System.out.println(i+"}");
			}else {
			System.out.print(i+", ");
			}
		}count4++;
	}//for 닫음
	System.out.println("약수의 개수는 "+count4+"개 입니다.");
	
	//5번
	int[] arr5 = {3,4,5,6,7};
	int even = 0; //짝수 저장
	int odd = 0; //홀수 저장
	for(int i=0; i<arr5.length; i++) {
		if(arr5[i]% 2 == 0) {
			even++;
		}else  {
			odd++;
		}
	}System.out.println("= 홀수 "+odd+"개, 짝수 "+even+"개");
	
	int even5 = 0;
	int odd5 = 0;
	int[] num5 = new int[5];
	for(int i=0; i<num5.length; i++) {
		System.out.print("숫자5개를 입력하시오>");
		num5[i] = in.nextInt();
		if(num5[i]%2 ==0) {
			even5++;
		}else {
			odd5++;
		}
	}System.out.println("= 홀수 "+odd5+"개, 짝수 "+even5+"개");
	
	//6번
	int random = (int)(Math.random()*100)+1;
	int count6 =0;
	while(true) {
		System.out.print("1과 100 사이의 값을 입력하세요>");
		int user6 = in.nextInt();
		if(random > user6) {
			System.out.println("더 큰수를 입력하세요");
		}else if(random < user6) {
			System.out.println("더 작은 수를 입력하세요");
		}else {
			System.out.println("맞췄습니다.");
		}count6++;
		System.out.println("시도횟수는 "+count6+"번입니다.");
	}
	
	
		
	
	
	
	
	
	
	
	
	
	}

}
