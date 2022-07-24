package study;

public class loop_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복해서 실행
		//for (초기값; 조건식; 증감값){반복할문장}
		//1~100까지 숫자를 더하라.
		//합을 저장한 변수 sum 선언
		int sum = 0;
		int i;
		for(i=1; i<=100; i++) {	//1부터; 100까지; 1씩 증가
			sum+=i;						//합을 구한다.sum=sum+i;
		}
		System.out.println("1~"+(i-1)+"까지의 합은 "+sum);
	}

}
