package study;
import java.util.Scanner;
public class CaculatorTest {
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	Calculator get = new Calculator();
	System.out.print("연산하고자 하는 첫번째 정수를 입력하세요>");
	get.num1 = s.nextInt();
	System.out.print("연산하고자 하는 연산자를 입력하세요>");
	get.in = s.next().charAt(0);
	char in = get.in;
	System.out.print("연산하고자 하는 두번재 정수를 입력하세요>");
	get.num2 = s.nextInt();
		if(in == '+') {
			System.out.print("연산결과는 ");
			System.out.println(get.getAdd()+"입니다.");
		}else if(in == '-') {
			System.out.print("연산결과는 ");
			System.out.println(get.getSub()+"입니다.");
		}else if(in == '*') {
			System.out.print("연산결과는 ");
			System.out.println(get.getMul()+"입니다.");
		}else if(in == '/') {
			System.out.print("연산결과는 ");
			System.out.println(get.getDiv()+"입니다.");
		}
	
	//2번
	Calculator cal = new Calculator();
	System.out.print("2_연산하고자 하는 첫번째 정수를 입력하세요>");
	int cal1 = s.nextInt();
	System.out.print("2_연산하고자 하는 연산자를 입력하세요>");
	char in2 = s.next().charAt(0);
	System.out.print("2_연산하고자 하는 두번재 정수를 입력하세요>");
	int cal2 = s.nextInt();
	long call = (long)cal1;
	float calf = (float)cal2;
	double cald = (double)cal1;
		if(in2 == '+') {
			System.out.println(cal.cal(cal1, cal2)+"입니다.");
		}else if(in2 == '-') {
			System.out.println(cal.cal(call, cal2)+"입니다.");
		}else if(in2 == '*') {
			System.out.println(cal.cal(cal1, calf)+"입니다");
		}else if(in2 == '/') {
			System.out.println(cal.cal(cald, cal2)+"입니다");
		}
	//2번 재도전!!
	Calculator ca = new Calculator();	
	System.out.println("2_연산하고자하는 두 정수값과 연산자 입력하시오");
	System.out.print("2_첫번째숫자 입력>");
	double ca1 = s.nextDouble();
	System.out.print("2_연산자 입력>");
	char op = s.next().charAt(0);
	System.out.print("2_두번째숫자 입력>");
	double ca2 = s.nextDouble();
	System.out.println("연산결과는"+ca.call(ca1,op,ca2)+"입니다.");
	
	//3번
	Calculator solution = new Calculator();
	System.out.print("3_첫번째 정수를 입력하시오");
	solution.a = s.nextInt();
	System.out.print("3_두번째 정수를 입력하시오");
	solution.b = s.nextInt();
	solution.sol(solution.a, solution.b);
		
		

	}//메인메소드 닫음
}//클래스닫음
