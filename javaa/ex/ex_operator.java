package ex;
import java.io.Console;
public class ex_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
		만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		13개의 바구니가 필요할 것이다.
		필요한 바구니의 수를 구하는 코드를 작성하시오.*/
		double apple = 123; //사과를 저장하는 변수
		int buk = 10; 	//한 바구니당 사과 수
		System.out.println("필요한 바구니의 수:"+(int) Math.ceil(apple/buk));
		//단순히 몫에 바구니 1개 더하는표현은 오류발생함(사과가 120개일때, 바구니는 13)
		//삼항연산자 표현
		//나머지가 0이면 ? 바구니수 =몫 : 바구니수=몫+1 ;
		//System.out.println(apple%buk == 0? apple/buk : apple/buk+1) ;
		
		/*2. 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드를 작성하시오.
		[Hint] 삼항 연산자를 두 번 사용하라. */
		int num = 150;
		num = 0;
		System.out.println(num>0? "양수" : num<0? "음수": "0");
		
		//3. 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		byte a =10;
		byte b = 20;
		byte c = (byte) (a+b);	//형변환
		char ch = 'A';			//'A' = 65
		ch = (char) (ch+2);		//형변환'A' + 2 = 'C'
		//3/2는 int가 float로 자동형변환됨.
		float f = 3/2f; 		//접미사f
		long l = 3000*3000*3000L; //접미사L
		float f2 = 0.1f;	
		double d = 0.1;
		boolean result = ((float)d==f2);	//소수점 표현 범위의 차이
		
		System.out.println("c="+c);		//c=30
		System.out.println("ch="+ch);	//ch=C
		System.out.println("f="+f);		//f=1.5
		System.out.println("l="+l);		//l=27000000000
		//19.17 = 전체 19자리이고, 소수점이하는 17자리
		System.out.printf("f2=%19.17f%n",f2);
		System.out.printf("d=%19.17f%n",d);
		System.out.printf("d2=%19.17f%n",(float)d);
		System.out.println("result="+result);	//result=true
	
		/*4. 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 
		 * 숫자일 때만 변수 bb의 값이 true가 되도록 하는 코드를 작성하시오.
		 * [Hint] ASCII코드값을 활용하라.  */
		boolean bb;
		ch = '가';
		if( (ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57) ) {
			bb = true;
		}else {
			bb = false;
		}
		System.out.println(bb);
		ch = 'L';
		boolean bbb = (ch>='A'&& ch<='Z') || (ch>='a' && ch <='z') || (ch>='0' && ch<='9')? true : false;
		System.out.println(bbb);
	}

}
