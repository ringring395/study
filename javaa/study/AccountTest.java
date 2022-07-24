package study;
public class AccountTest {
	public static void main(String[] args) {
		
		Account cc = new Account();
		cc.setBalance(5000);
		System.out.println(cc.getBalance());
		cc.setBalance(-500);		//음수
		System.out.println(cc.getBalance());
		cc.setBalance(3000000);		//백만원 초과
		System.out.println(cc.getBalance());	
		cc.setBalance(80000);
		System.out.println(cc.getBalance());	
		

		
	}

}
