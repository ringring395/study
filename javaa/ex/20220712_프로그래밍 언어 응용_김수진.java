package ex;
import java.util.Scanner;
public class ex_220712 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int select = 0;		//번호 선택
	int student = 0;	//학생수
	int[] grade = null;	//성적 넣을 배열
	int max = 0;		//최고점수
	int sum = 0;		//합계
	float avg = 0f;		//평균점수
	
	while(true) {	//break나올때까지 무한반복
		System.out.println("------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");	
		System.out.println("------------------------");	
		System.out.print("선택>");
		select = s.nextInt();
		//선택값에 따라서 실행문 달라짐.
		if(select==1) {			//1번선택할때
			System.out.print("학생수>");
			student = s.nextInt(); 
			grade = new int[student];	//입력한 학생수만큼 배열 생성
		}else if(select==2) {	//2번선택할때
			//student수 만큼 성적 입력 하는 반복문
			for(int i = 0; i<student; i++) {
				System.out.print("학생>(점수만 키보드로 입력)");
				grade[i] = s.nextInt();
			}//for닫음
		}else if(select==3) {	//3번선택할때
			//student수 만큼 성적 차례대로 출력하는 반복문
			for(int i = 0; i<student; i++) {
				System.out.println("학생>"+grade[i]+"(출력)");
			}//for닫음
		}else if(select==4) {	//4번선택할때
			for(int i = 0; i<student; i++) {
				if(max <grade[i]) {
					max = grade[i];
				}
			}//max 닫음
			for(int i = 0; i<student; i++) {
				sum += grade[i];			//합계
				avg = sum/student;	//평균
			}//avg 닫음
		System.out.println("최고 점수 : "+max);
		System.out.println("평균 점수 : "+avg);
		}else if(select==5) {	//5번 선택할때
			System.out.println("프로그램 종료");
			break;
		}	
	
	}//while 닫음
	}//메인메소드 닫음
} //ex_220712 닫음
