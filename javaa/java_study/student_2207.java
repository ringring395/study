package java_study;
import java.util.Scanner;
public class student_2207 {

	public static void main(String[] args) {
	/*학생수를 입력값으로 받고  학생이름 학과 학년을 학생수만큼 입력한 다음
	가장많은 학과의 학생수와 가장많은학년이 있는 학년을 출력하면 됩니다
	학생수:4
	학생이름:듀공
	학과:컴퓨터
	학년:1
	학생이름:하마
	학과:전기
	학년:1
	학생이름:독수리
	학과:간호
	학년:2
	학생이름:코뿔소
	학과:간호
	학년:3
	찾고 싶은 학과 이름
	간호
	간호과 소속의 학생은 2명 입니다.
	가장 많은 학생의 학년은 1입니다.*/
	Scanner s = new Scanner(System.in);	
	System.out.print("학생 수를 알려주세요>");
	int student = s.nextInt();				//학생 수를 저장
	String[] name = new String[student];	//해당 수만큼 이름 배열 생성
	String[] major = new String[student];	//해당 수만큼 전공 배열 생성
	int[] grade = new int[student];			//해당 수만큼 학년 배열 생성
	for(int i=0; i<student; i++) {
//		System.out.print("학생 이름을 입력하세요>");
//		name[i] = s.next();
//		System.out.print("학과를 입력하세요>");
//		major[i] = s.next();
		System.out.print("학년을 입력하세요>");
		grade[i] = s.nextInt();
	}//for문 닫음
	
	//가장 많은 학과의 학생수
	
	
	
	
	
	//가장 많은 학년 수
	int modeNum = 0; 
//	int[] grade2 = new int[grade.length]; //카운팅 넣을 새 배열
//	for(int i=0; i<grade.length; i++) {
//		int a = grade2[grade[i]]++; //새 배열에 카운팅 입력
//		System.out.println(a);
//	}
//	int modeNum =0;			//최빈값 
//	int modecount = 0;		//최빈값 횟수
//	for(int i=0;i<grade.length;i++) {
//		if(modecount < grade2[i]) { //새로운 배열에서 최고값 찾음
//			modecount = grade2[i]; //새로운 배열에서 최고값을 챙겨옴
//			modeNum = i;
//		}
//	}
	System.out.println("가장 많은 학생의 학년은 "+modeNum+"입니다.");
	
	
	}
}
