package ex;
import java.util.Scanner;
public class ex_220712_Stu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int menu = 0;		//1~5 번호 저장 변수
		int count=0;		//학생 수를 저장 변수
		int[] scoreArr= {};	//학생 점수를 배열로 저장
		int max=0;
		float avg=0f;
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			menu = s.nextInt();	//키보드로 선택한 숫자를 menu에 저장
			
			if(menu==1) {		//1번을 선택했으면,
				System.out.print("학생수 >");
				count = s.nextInt();		//학생수를 count변수에 저장
				scoreArr = new int[count];	//입력한 학생수가 배열 길이를 결정
			}else if(menu==2) {	//2번을 선택했으면,
				for(int i=0;i<scoreArr.length;i++) {
					System.out.print("학생>");
					max=scoreArr[0];		//4번의 max값을 위해서 입력함
					scoreArr[i]=s.nextInt();//학생점수를 배열(scoreArr) index에 저장
				}
			}else if(menu==3) {	//3번을 선택했으면,
				for(int i=0;i<scoreArr.length;i++) {	//배열의 각 index값 출력
					System.out.println("학생>"+scoreArr[i]);
				}
			}else if(menu==4) {	//4번 선택했으면,
				for(int i=0;i<scoreArr.length;i++) {	//max구하기
					if(max<scoreArr[i]) {
						max=scoreArr[i];
					}
					avg+=scoreArr[i]/(float)scoreArr.length;	//avg구하기
				}
				System.out.println("최고점수 : "+max);
				System.out.println("평균점수 : "+avg);
			}else if(menu==5){	//5번 선택했으면
				System.out.println("프로그램 종료");
				break;			//while(true)중지
			}else {
				System.out.println("1~4 중 하나를 선택하세요!~");
			}
		}//while 닫음
	}//메인메소드 닫음
}// class닫음