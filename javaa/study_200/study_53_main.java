package study_200;

public class study_53_main {
	//for, it 이용 홀수합구하기
	public static void main(String[] args) {
		int num = 0;
		for(int i=1; i<=100; i++) {
			num+=i;
		}
		System.out.println("1~100의 합:"+num);
		num = 0;	//num 초기화
		for(int i=1; i<=100; i++) {
			if(i%2==1) {	//홀수면
				num+=i;
			}
		}
		System.out.println("1~100의 홀수 합:"+num );
	}
}
