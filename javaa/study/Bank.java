package study;
import java.util.Scanner;
//뱅크 객체
public class Bank {
	Scanner s = new Scanner(System.in);
	String number;	//계좌번호
	String name;	//계좌주
	int count;		//초기입금액

	
	public String getNumber() {return number;}
	public void setNumber(String number) {
		this.number = number;
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

	}
	
	void numlist() {		//계좌목록 출력
		
	}
	
	void numcheck() {		//계좌번호 확인

	}
	
	void deposit() {	//입금
		
	}
	
	void withdraw() {	//출금
		
	}
	

}
