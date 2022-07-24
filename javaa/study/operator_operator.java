package study;

public class operator_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		산술 연산자		+, -, *, /, %
//		비교 연산자		>, <, >=, <=, ==, !=
//		논리 연산자		&&, ||, !
//		대입 연산자		=, +=, -=, *=, /=, %=
//		삼항 연산자		? :
		int x = 2;
		int y = 5;
		char c = 'A';
		System.out.println(y >=5 || x<0 && x>2);//true
		System.out.println(y+=10 - x++); 		//15-2 = 13
		System.out.println(x+=2);				//3+2 =5
		System.out.println(!('A'<=c && c<='Z'));//!(true) = false
		//true && true =true -> ! -> false
		System.out.println('C'-c);				//67-65 = 2
		System.out.println('5'-'0');			//53-48 = 5

		System.out.println(c+1);				//65+1 = 66
		//System.out.println(c); c+1은 단순연산이라 후에 반영이 안되나?
		System.out.println(++c);				//C=65를 1증가 시키고, 66 B출력
		System.out.println(c++);				//66 B 출력하고, 1증가 시킴.
		System.out.println(c);					//67 C
	
	}

}
