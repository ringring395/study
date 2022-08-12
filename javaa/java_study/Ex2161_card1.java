package java_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2161_card1 {
//김수진
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int card = s.nextInt();					//카드 장수를 입력받는다.

		Queue<Integer> qq = new LinkedList<>();	//큐 선언
		
		for(int q=1; q<=card; q++) {			//큐(qq)에 카드를 넣자
			qq.offer(q);
		}
		
		for(int i=0; i<card; i++) {				//카드 장수 만큼 for문 돌림
			if(!qq.isEmpty()) {					//큐(qq)가 비어 있는게 아니라면
					System.out.print(qq.poll()+" ");//맨위 꺼내고 출력
					qq.offer(qq.poll());			//맨위 꺼내서 맨뒤로 넣음
			}else {								//큐(qq)가 비었다면? 멈춰라!!
				break;
			}			
		}//for문 닫음
		
		s.close();
	}//메인메소드 닫음
}
