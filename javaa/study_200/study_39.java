package study_200;

public class study_39 {
	//카드값 구하기
	public static int toNum(char c) {
		int card = 0;
		switch(c) {
			case'A':
				card = 1;
				break;
			case'T':
				card = 10;
				break;	
			case'J':
				card = 11;
				break;
			case'Q':
				card = 12;
				break;
			case'K':
				card = 13;
				break;
			default :
				card = c-'0';
				break;	
		}
		return card;
	}
	public static void main(String[] args) {
		char c = 'J';
		int result=toNum(c);
		System.out.printf("%c=>%d\n",c,result);
	}
}
