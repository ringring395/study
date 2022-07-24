package study;
import java.util.Scanner;
//뱅크 객체
public class Bank {
	Scanner s = new Scanner(System.in);
	private String number;	//계좌번호
	private String name;	//계좌주
	private int count;		//초기입금액
	
	Bank(String num, String na, int c){
		this.number = num;
		this.name = na;
		this.count = c;
	}

	//getter와 setter 메소드 선언
	//static없으니, 인스턴스 메소드
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

	

}
