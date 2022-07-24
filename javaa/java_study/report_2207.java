package java_study;
import java.util.HashSet;
import java.util.Scanner;
public class report_2207 {
	public static void main(String[] args) {
	//중첩정리. 	
		Scanner s = new Scanner(System.in);
		HashSet<Integer> stu = new HashSet<Integer>();
		
		for(int i= 1; i<=28; i++) {	
			System.out.print("제출한 학생번호 입력>");
			int in = s.nextInt();
			stu.add(in);
		}
		//입력된 학생번호		
		//입력된  학생번호 중에 미제출 학생 찾기		
		//1~30번까지 반복해서 물어봄
		for(int i=1; i<=30; i++) {
			//true가 나오면 제출한 학생이고
			// false가 나오면 미제출 학생이고
			if(stu.contains(i)==false) {
				System.out.println("미제출 학생 번호 : "+i);
			}
		}
	}

}
