package study;

public class variable_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=85;
		//		(타입) 변수명
		//byte b =(byte)a;
		//byte -> int
		//b = 10;
		//a = b;
		//System.out.println(a);
		//int(4) ->float(4)
		float c =a;
		System.out.println(c);
		//float(4) ->int(4)
		a =(int) c ;
		System.out.println(a);

		//자동형변환을 할 수 있는 것은?
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		//int(4) -> byte(1)
		b = (byte) i;	
		System.out.println(b);
		//byte(1) -> char(2)
		ch = (char) b;			//아스키코드 100번 d가 출력됨.
		System.out.println(ch);
		//char(2) -> short(2)
		short s = (short) ch;	
		System.out.println(s);
		//long(8) -> float(4)
		float f = l;	
		System.out.println(f);
		//short(2) -> int(4)
		i = ch;			
		System.out.println(i);
	}

}
