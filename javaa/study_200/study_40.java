package study_200;

public class study_40 {
	//환율 구하기
	public static double toMoney(String c) {
		double don =0.0;
		switch(c) {
			case "USD":
				don = 1438.0;
				break;
			case "EUR":
				don = 1418.1;
				break;
			case "JPY":
				don = 973.9;
				break;	
			default :
				don = 1;
				break;	
		}
		return don;
	}
	public static void main(String[] args) {
		String money = "USD";
		double result = toMoney(money);
		System.out.printf("%s=>%f\n",money,result);
	}	
}
