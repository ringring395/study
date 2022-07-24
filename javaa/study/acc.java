package study;
import java.util.Scanner;
public class acc {
	Scanner s = new Scanner(System.in);
	private String account;	//계좌번호 저장
	private String name;	//계좌주 저장
	private int count;		//잔액 저장
	//기본 생성자
	acc(){	}
	public String getAccount() {return account;	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {return count;}
	public void setCount(int count) {
		this.count = count;
	}

	void create() {		//계좌생성
		System.out.println("=계좌생성=");
	}
	
	void numlist() {		//계좌목록 출력
		System.out.println("=계좌목록=");
	}
	
	void numcheck() {		//계좌번호 확인

	}
	
	void deposit() {	//입금
		System.out.println("=입금=");
	}
	
	void withdraw() {	//출금
		System.out.println("=출금=");		
	}	
}//acc닫음
