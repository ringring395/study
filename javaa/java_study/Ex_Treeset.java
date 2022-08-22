package java_study;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex_Treeset {
	//김수진
		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			TreeSet<Integer> ts = new TreeSet<>();	//treeset 사용선언
			Iterator it = ts.iterator();
			
			int N = s.nextInt();				//카드 N장 
			int k = s.nextInt();				//K번째로 큰수
			int result = 0;						//결과값 저장 변수
			int j=0;
			
			for(int i=0; i<N; i++) {			//랜덤카드 N장을 treeset에 넣자
				ts.add((int)(Math.random()*98)+3);
			}
			System.out.println(ts);
			//k번만큼
			if(j<k) {
				result += (int)(it.next());
				j++;
			}

			
			

		s.close();	
		}//메인메소드 닫음
}
