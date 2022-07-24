package study;

public class loop_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while(조건식){반복할문장}
		//1~100 숫자의 합이 100미만이 될 동안 반복해라.
		//합을 저장할 sum변수 선언
		int sum = 0;
		//i 전역변수로 설정함.
		int i = 0;
		while(sum<100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
