package study;
import java.util.ArrayList;
import java.util.Scanner;
public class BankApp {
	public static void main(String[] args) {
		//ArrayList<Bank> acc = new ArrayList<>();
		Bank[] cnt = new Bank[10];
		Scanner s = new Scanner(System.in);
		int select = 0;
		int i=0;
		int member = 0;
		String tmp = "";
	
	while(true) {

		System.out.println("~~~~~~~~~~~~");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료|");
		System.out.println("~~~~~~~~~~~~");
		System.out.print("선택>");
		select = s.nextInt();

		if(select==1) {
			System.out.println("==계좌생성==");
			cnt[i] = new Bank();
			System.out.print("계좌번호>");
			cnt[i].number = s.next();
			System.out.print("계좌주>");			
			cnt[i].name = s.next();
			System.out.print("초기입금액>");			
			cnt[i].count = s.nextInt();		
			System.out.println("결과 : 계좌가 생성되었습니다.");
			member = i++;
			
		}else if(select==2) {
			System.out.println("==계좌목록==");
			for(i=0; i<=member; i++) {
				System.out.print(cnt[i].number+" ");
				System.out.print(cnt[i].name+" ");
				System.out.println(cnt[i].count);
			}
			
		}else if(select==3) {
			System.out.println("==예금==");
			System.out.print("계좌번호>");
			tmp = s.next();	//입력한 계좌번호	
			//전체 계좌번호를 검색해볼텐데			
			for(int k=0; k<=member; k++) {
				//그중에 입력한 계좌번호랑 같으면
				if(cnt[k].number.equals(tmp)) {
					System.out.print("예금액>");
					cnt[k].count += s.nextInt();	
					System.out.println("결과 : 예금이 성공되었습니다.");
				}
			}//3번선택 for닫음
			
		}else if(select==4) {
			System.out.println("==출금==");
			System.out.print("계좌번호>");
			tmp = s.next();		
			for(int k=0; k<=member; k++) {
				if(cnt[k].number.equals(tmp)) {
					System.out.print("출금액>");	
					cnt[k].count -= s.nextInt();
					System.out.println("결과 : 출금이 성공되었습니다.");						
				}
			}//4번선택 for닫음		
			
		}else if(select==5) {
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("1~5번 중에서 선택해주세요.");
		}
		
		
		
	}//while닫음
		
		

	}	
}
