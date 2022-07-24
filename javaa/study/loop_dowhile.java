package study;

public class loop_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do{반복할 문장}while(조건식)
		int sum = 200;
		int i=0;
		do {
			System.out.println("Dowhile문 실행");
			sum+=i;
			i++;
		}
		while(sum<100);
		System.out.println(sum);
	}

}
