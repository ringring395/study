package study;
import java.util.Scanner;
public class array_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언 및 초기화
		int[] array = {100,200,300,400,88,500,600,77};
		/*//배열을 하나씩 출력해보자.(인덱스값 필요)
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);*/
		//for 반복문을 이용해 출력하자.
		for(int i=0; i<array.length; i++) {
		//	System.out.println(array[i]);
		}
		
		//10명의 학생의 점수에 총점, 평균, 최댓값, 최솟값을 구해보자.
		// {79,88,91,33,100,55,95,60,72,57}
		Scanner s = new Scanner(System.in); 
		//int[] school = {79,88,91,33,100,55,95,60,72,57};
		//배열 선언과 동시에 초기화
		//int[] school = {0,0,0,0,0,0,0,0,0,0}; //10칸 배열 선언
		//배열 선언(길이만 정함)
		int[] school = new int[10];
		//main 함수 밑에 있는 지역변수이다. java는 지역변수 초기화 필수
		int sum = 0;			//총점을 저장하는 sum변수 선언
		float avg = 0.0f;		//평균을 저장하는 (실수형)avg변수 선언
		int max = 0;	//최댓값을 저장하는 max변수 선언
		int min = 100;	//최솟값을 저장하는 min변수 선언


		//반복문		i가 school길이만큼		1씩증가
		for (int i=0; i<school.length; i++) {
			System.out.print("성적을 입력하세요");
			school[i] = s.nextInt();
			//안에서 다시 시작해야 값 오류 없음

			sum += school[i];			//총점
			//평균 = 총점/학생수 
			//둘 중 하나만 float으로 강제형변환 해주면 됨.
			avg = sum/(float)(school.length);
			if (school[i] > max) {		//최댓값
				max = school[i];		//조건식이 참이면 실행.
			}
			//else if면 최솟값이 안들어오고 빠져버림
			if(school[i] < min) {	//최솟값
				min = school[i];
			}
		}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}

}
