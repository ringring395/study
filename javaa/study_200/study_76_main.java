package study_200;

public class study_76_main {
//숫자와 특수문자 가려내기
	public static void main(String[] args) {
		//객체 생성
		Character chr1 = new Character('W');
		Character chr2 = new Character('9');
		//isLetter : 입력된게 문자인지 boolean으로 확인 / 문자면 true
		System.out.println("isLetter : "+Character.isLetter(chr1));
		//문자를 int로 변환
		System.out.println("int로 변환 : "+(int)chr1);
		//Integer.toHexString : 정수를 16진수로 변환
		System.out.println("toHexString : "+Integer.toHexString((int)chr1));
		//isDigit : 입력된게 숫자인지 boolean으로 확인 / 숫자면 true
		System.out.println("isDigit : "+Character.isDigit(chr2));
		//getType : 입력된 문자의 타입을 구분해서 int로 알려줌
		//대문자=1, 소문자=2, 숫자=9
		//공백문자(white space)=15, 특수문자=24
		System.out.println("getType : "+Character.getType('A'));	//대문자=1
		System.out.println("getType : "+Character.getType('a'));	//소문자=2
		System.out.println("getType : "+Character.getType('3'));	//숫자=9
		System.out.println("getType : "+Character.getType('\n'));	//공백문자(white space)=15
		System.out.println("getType : "+Character.getType('&'));	//특수문자=24
		//공백문자(white space) 값 확인
		System.out.println("공백문자_b : "+(int)'\b');	//백스페이스=8
		System.out.println("공백문자_t : "+(int)'\t');	//탭=9
		System.out.println("공백문자_n : "+(int)'\n');	//엔터=10 
		System.out.println("공백문자_f : "+(int)'\f');	//폼=11
		System.out.println("공백문자_r : "+(int)'\r');	//캐리지되돌림=12
		//isWhitespace : 공백문자인지 확인 / 맞으면 true
		//공백문자 범위 = 9~13, 28~31
		//자바기준
		System.out.println("isWhitespace : "+Character.isWhitespace(' '));
		System.out.println("isWhitespace : "+Character.isWhitespace('\n'));
		System.out.println("isWhitespace : "+Character.isWhitespace('\r'));
		System.out.println("isWhitespace : "+Character.isWhitespace('\b'));	//false : 8이라서 공백문자 아님
		//isLetterOrDigit : 숫자인지 문자인지 / 숫자면 true
		System.out.println("isLetterOrDigit : "+Character.isLetterOrDigit('9'));
		//isLowerCase : 소문자인지 / 소문자면 true
		System.out.println("isLowerCase : "+Character.isLowerCase('A'));
		//isUpperCase : 대문자인지 / 대문자면 true
		System.out.println("isUpperCase : "+Character.isUpperCase('A'));
	}
}
