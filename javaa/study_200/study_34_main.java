package study_200;

public class study_34_main {
	public static void main(String[] args) {
		//if 조건문
		int num = 99;	
		if(num%2==1) {	//홀수
			num = num*100;
		}else {			//짝수
			num = num/2;
		}
		System.out.println("if조건문");
		System.out.printf("확인 후 = %d\n", num);
		
		//삼항 연산자		
		int num3 = 99;
		num3 = (num3%2==1)? num3*100 : num3/2;
		System.out.println("삼항연산자");
		System.out.printf("확인 후 = %d\n", num3);
	}
}
