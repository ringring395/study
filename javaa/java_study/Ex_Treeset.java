package java_study;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex_Treeset {
	//김수진
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//treeset(중복 제거해줌) 선언 , 내림차순 정렬
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		
		int N = s.nextInt();			//카드 N장 
		int k = s.nextInt();			//K번째로 큰수
		int result = 0;					//결과값 저장 변수
		
		for(int i=0; i<N; i++) {		//랜덤카드 N장을 TreeSet에 넣자
			ts.add((int)(Math.random()*98)+3);				
		}
		//랜덤카드 잘 뽑혔는지 확인용
		System.out.println(ts);

				
		//큰 수 k개를 더하자.
		if(k == 0) { 					//k가 입력되지 않으면 -1(null이어야 되는거 아닌가)
			result = -1;
		}else {							//k번째까지 더하기
			for(int j=0; j<k; j++) {	
				int first = ts.first();	//젤첫번째값 가져오기
				result += first;		//result에 저장하고
				ts.remove(first);		//젤첫번째값 삭제
			}
		}
		System.out.println(result);
		
	s.close();	
	}//메인메소드 닫음
}
