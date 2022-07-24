package study;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
public class BankApp {
	//static Bank b = new Bank();를 객체배열로 바꿈
	//static Bank[] b = new Bank[10]; //객체배열(동적배열)
	//동적배열(vector)
	static Vector b = new Vector();
	static Scanner s = new Scanner(System.in);
	
	//1. 계좌생성 메소드 선언(createAccount)
	static void createAccount() {
		System.out.println("==계좌생성==");
		System.out.print("계좌번호 : ");
		String number = s.next();
		System.out.print("계좌주 : ");
		String name = s.next();
		System.out.print("초기입금액 : ");
		int count = s.nextInt();
		
		Bank cnt = new Bank(number, name, count);
		b.add(cnt);		//참조변수 bank에 저장되어있는 주소를 vector클래스에 추가하게 됨 
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
	}//createaccount닫음
	
	//2. 계좌목록 메소드 선언(accountlist)
	static void accountlist() {
		System.out.println("==계좌목록==");
		for(int i=0; i<b.size(); i++ ) {
			Bank bnk = (Bank)b.get(i);
			if(bnk!=null) {
				System.out.print(bnk.getNumber()+" ");
				System.out.print(bnk.getName()+" ");
				System.out.println(bnk.getCount());	
			}
			
		}//for 닫음
		
	}//accountlist 닫음
	
	//3. 예금 메소드 선언 deposit
	static void deposit() {
		System.out.print("계좌번호>");
		String number = s.next();
		System.out.print("예금액>");
		int money = s.nextInt();
		Bank bnk = findaccount(number);
		if(bnk==null) {
			System.out.println("해당하는 계좌가 없습니다.");
		}else {
		//키보드로 입력한 계좌번호와 bank클래스에 있는 계좌번호가 같으면
			bnk.setCount(bnk.getCount() + money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
		
	}//deposit 닫음
	
	//4. 출금 메소드 선언 withdraw
	static void withdraw() {
		System.out.print("계좌번호>");
		String number = s.next();
		System.out.print("출금액>");
		int money = s.nextInt();
		Bank bnk = findaccount(number);
		if(bnk==null) {
			System.out.println("해당하는 계좌가 없습니다.");
		}else {
		//키보드로 입력한 계좌번호와 bank클래스에 있는 계좌번호가 같으면
			bnk.setCount(bnk.getCount() - money);
			System.out.println("결과: 출금이 성공되었습니다.");
		}
		
	}//withdraw 닫음
	
	//계좌번호 찾기 메소드 선언 findaccount
	static Bank findaccount(String number) {
		// bank 클래스에 있는 계좌번호와 키보드로 입력한 계좌번호가 같으면
		Bank bnk = null;
		for(int i=0;i<b.size(); i++) {
			//bank클래스에 있는 계좌번호
			if(b.get(i)!=null) {
				bnk = (Bank)b.get(i);
				String Arraynum = bnk.getNumber();
				//키보드로 입력한 계좌번호(매개변수를 통해 넘어온 number)
				//Bank클래스에 있는 계좌번호(Arraynum) == 키보드로 입력한 계좌번호
				if(Arraynum.equals(number)) {
					bnk = (Bank)b.get(i);
				}
			}

		}//for 닫음
		return bnk;
	}//findaccount 닫음
	
	
	public static void main(String[] args) {
		//main메소드는 static이 있기 때문에 클래스 메소드가 된다
		//void createaccoutn()메소드는 인스턴스라서 호출이 안된다.
		//따라서 static void createaccount()로 해서 호출한다.
		while(true) {
			System.out.println("~~~~~~~~~~~~");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료|");
			System.out.println("~~~~~~~~~~~~");
			System.out.print("선택>");
			int select = s.nextInt();
			
			if(select==1) { //1번 입력하면
				createAccount();
			}
			else if(select==2) {
				accountlist();
			}
			else if(select==3) {
				deposit();
			}
			else if(select==4) {
				withdraw();
			}
			else if(select==5) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("1~5번중에서 선택해주세요");
			}
		}//while문 닫음

	}//메인메소드 닫음
}