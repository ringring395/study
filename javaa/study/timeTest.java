package study;

public class timeTest {

	public static void main(String[] args) {
		//		매개변수 3개인 생성자 호출
		time t = new time(12,06,56);
		System.out.println(t.getHour()+"시");
		System.out.println(t.getMin()+"분");
		System.out.println(t.getSec()+"초");
		
		time t1 = new time(30,100,5000);
		System.out.println(t1.getHour()+"시");
		System.out.println(t1.getMin()+"분");
		System.out.println(t1.getSec()+"초");


		
	}

}
