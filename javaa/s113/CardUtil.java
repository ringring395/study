package s113;

public class CardUtil {
	public static final int sutda=2;
	public static final String[] suit= {"H","C"};
	public static final String[] valu= {"A","2","3","4","5","6","7","8","9","1"};
	
	public static int toVal(Card c) {
		return toVal(c.getCardVal().charAt(1));	//H6에서 6
	}
	public static int toVal(Card c, int index) {
		return toVal(c.getCardVal().charAt(index));
	}
	public static int toVal(char cc) {
		int tot=0;
		switch(cc) {
			case'A':
				tot=1;
				break;
			case'T':
				tot=10;
				break;
			case'J':
				tot=11;
				break;
			case'Q':
				tot=12;
				break;
			case'K':
				tot=13;
				break;
			default:
				tot=cc-'0';
				break;
		}
		return tot;
	}
}
