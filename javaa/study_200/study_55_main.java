package study_200;

public class study_55_main {
//배열 출력하기
	public static void print(int ... mm) {
		for(int m : mm) {
			System.out.printf(m+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]mm = {5,14,15,23,34,43};
		print(mm);
		int a=5, b=14, c=15;
		print(a);
		print(a,b);
		print(a,b,c);
	}
}
