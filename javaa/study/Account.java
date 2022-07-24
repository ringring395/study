package study;
public class Account {
	//전역변수(초기화 없이 선언만 해도됨)
	//﻿외부에서 balance 필드를 마음대로 변경하지 못하도록 하고,
	private int balance;	//잔고 변수
	//﻿MIN_BALANCE와 MAX_BALANCE 상수를 선언
	//final(상수)는 초기화 필요
	final int Min_Balance = 0;	
	final int Max_Balance = 1000000;	

	//getter & setter
	//﻿SetBalance와 GetBalance 메소드를 이용
	public int getBalance() {return balance;}
	public void setBalance(int balance) {
		//﻿0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록
		if(balance>=Min_Balance && balance<=Max_Balance ) {
			this.balance += balance;
		}else {
			System.out.println("입력한 금액을 다시 확인해주세요.");
		}
	}

}//Account 닫음
