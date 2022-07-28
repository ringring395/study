package java_study;

public class ex2839_sugar {
	public static void main(String[] args) {
		//현재 가진 설탕 N
		int N =11;//(int)(Math.random()*5000+3);
		System.out.println("현재 가진 설탕"+N+"kg");
		int su5 = 0;	//5킬로짜리 봉지 수
		int su3 = 0;	//3킬로짜리 봉지 수
		
		if(N%5 == 0) {
			su5 = N/5;
			System.out.println(su5);
		}else if(N%5%3 == 0) {
			su5 = N/5;	//5킬로짜리 봉지 수
			su3 = N%5/3;	//3킬로짜리 봉지 수
			System.out.println("5킬로"+su5);
			System.out.println("3킬로"+su3);
			System.out.println(su5+su3);
		}else if(N%3 == 0) {
			su3 = N/3;
			System.out.println(su3);
		}
		else {
			System.out.println(-1);
		}
		
		

	}

}
