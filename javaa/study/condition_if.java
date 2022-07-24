package study;
import java.util.Scanner;
public class condition_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//평균이 70점 이상이면 합격
		//평균을 저장하는 변수 avg

		float avg = 80f;
		if(avg>=70) { //평균이 70점 이상이라면
			//합격이라는 문자열을 출력
			System.out.println("합격");
		//avg는 float(4)
		//70은 int(4) float가 더 큰 타입(실수표현)
		//일치시켜 놓고 연산한다.
			
		}
		
		//평균이 70점 이상이면 합격, 그렇지 않으면 불합격
		//평균을 저장하는 변수(avg2)
		float avg2 = 65.5f;
		if(avg2>=70) {		//평균이 70점 이상이라면
			//합격이라는 문자열 출력
			System.out.println("합격");
		}else {
			//그렇지 않으면 불합격 문자열 출력
			System.out.println("불합격");
		}
		
		//if ~ else if ~ else문
		//평균이 70점 이상이면 합격, 60점 이상이면 보류, 그렇지않으면 불합격
		//평균을 저장하는 변수(avg3)
		Scanner s = new Scanner(System.in);
		//scanner 참조형 타입 / s 변수명 / new~ 값
		System.out.println("평균값을 입력하세요.");
		float avgg=s.nextFloat();
		if(avgg>=70) {
			System.out.println("합격");
		}else if(avgg>=60) {
			System.out.println("보류");
		}else {
			System.out.println("불합격");
		}
	}

}
