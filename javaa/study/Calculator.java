package study;
public class Calculator {
	//1번
	int num1;
	char in;
	int num2;
	int getAdd() {
		return num1+num2;
	}
	int getSub() {
		return num1-num2;
	}	
	int getMul() {
		return num1*num2;
	}
	float getDiv() {
		return num1/(float)num2;
	}
	//2번
	int cal(int a, int b) {
		return a+b;
	}
	long cal(long a, int b) {
		return a-b;
	}
	float cal(int a, float b) {
		return a*b;
	}
	double cal(double a, int b) {
		return a/b;
	}
	//2번 재도전!!
	double result =0;
	double call(int ca1, char op, int ca2) {
		if(op == '+') {
			result = ca1 + ca2;
		}else if(op == '-') {
			result = ca1 - ca2;
		}else if(op =='*') {
			result = ca1 * ca2;
		}else if(op =='/') {
			result = ca1 / ca2;
		}else {
			System.out.println("+ - * / 중 하나만 입력하세요");
		}return result;
	}//call 1번 닫음
	double call(double ca1, char op, int ca2) {
		if(op == '+') {
			result = ca1 + ca2;
		}else if(op == '-') {
			result = ca1 - ca2;
		}else if(op =='*') {
			result = ca1 * ca2;
		}else if(op =='/') {
			result = ca1 / ca2;
		}else {
			System.out.println("+ - * / 중 하나만 입력하세요");
		}return result;
	}//call 2번 닫음	
	double call(int ca1, char op, double ca2) {
		if(op == '+') {
			result = ca1 + ca2;
		}else if(op == '-') {
			result = ca1 - ca2;
		}else if(op =='*') {
			result = ca1 * ca2;
		}else if(op =='/') {
			result = ca1 / ca2;
		}else {
			System.out.println("+ - * / 중 하나만 입력하세요");
		}return result;
	}//call 3번 닫음	
	double call(double ca1, char op, double ca2) {
		if(op == '+') {
			result = ca1 + ca2;
		}else if(op == '-') {
			result = ca1 - ca2;
		}else if(op =='*') {
			result = ca1 * ca2;
		}else if(op =='/') {
			result = ca1 / ca2;
		}else {
			System.out.println("+ - * / 중 하나만 입력하세요");
		}return result;
	}//call 4번 닫음
	
	
	//3번
	//인스턴스 메소드
	void sol(int a, int b) {
		int sum = 0;
		if(a < b) {
			for(int i =a; i<=b; i++) {
				sum +=i;
			}//for 닫음
		System.out.println(sum);	
		}else if(a > b) {		//임시변수 활용해서 ab바꾸면됨
			for(int i =b; i<=a; i++) {
				sum +=i;
			}//for 닫음	
		System.out.println(sum);
		}else if(a == b) {
		System.out.println(a);
		}
	}
//	if(a > b) {		//a>b이면,
//		tmp = a;//a값을 tmp에 저장,
//		a = b;		//b값을 a에 저장,
//		b = tmp;	//tmp값을 b에 저장.
//	}
	
	//4번 
	//인스턴스 변수(static X)
	String name;	//학생이름
	int ban; 		//반
	int no;			//번호
	int kor;		//국어점수
	int eng;		//영어점수
	int math;		//수학점수
	
							//return 타입 없으면 void
	int getTotal() {		//return 타입오면 빨간줄 사라짐.
		return kor+eng+math;
	}
	float getAverage() {
		return (kor+eng+math)/(float)3;
		
	}
	
	
	
	
} //Calculator닫음


