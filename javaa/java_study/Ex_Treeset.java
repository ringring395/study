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
		int[] arr = new int[N];			//랜덤카드 N장 넣을 배열
		
		for(int i=0; i<N; i++) {		//랜덤카드 N장을 배열에 넣자
			arr[i]=(int)(Math.random()*98)+3;				
		}
		//랜덤카드 잘 뽑혔는지 확인용
		//System.out.println(Arrays.toString(arr));
		
		//3개씩 뽑은 합을 구해서 treeset에 넣어두기
		//삼중 for
		for(int c1=0; c1<N; c1++) {
			for(int c2=c1+1; c2<N; c2++) {
				for(int c3=c2+1; c3<N; c3++) {
					ts.add(arr[c1]+arr[c2]+arr[c3]);
				}
			}
		}
		//treeset에 잘 들어갔는지 확인용
		//System.out.println(ts);
		
		//treeset에 넣은 3개 합의 조합 중 k번째를 출력하자.
		if(k == 0) {				//k가 0이면 -1 출력
			System.out.println(-1);
		}else {
			int cnt=0;					//하나씩 카운트 올려서 k랑 맞출거임
			//향상된 for문 (ts배열을 a인덱스부터 순차 진행)
			for(int a : ts) {
				cnt++;
				if(cnt == k) {
					System.out.println(a);
				}
			}//for문 닫음
		}
		
	s.close();	
	}//메인메소드 닫음
}
