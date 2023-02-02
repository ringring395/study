package study_200;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class study_59_main {
//stream 이용
	public static void main(String[] args) {
		List<Integer> ex = new ArrayList<>();
		int num = 0;
		for(int i=1; i<=100; i++) {
			//리스트에 저장
			ex.add(i);
		}
		//초기값 0
		num=ex.stream().reduce(0,Integer::sum);
		System.out.println("1~100의 합:"+num);
		//홀수합 구하기
		num=0;	//num 초기화
		//					홀수 구하기			합 구하기
		num = ex.stream().filter(i->i%2==1).reduce(0, Integer::sum);
		System.out.println("1~100의 홀수 합:"+num);
		//					홀수 구하기			합 구하기		
		num=ex.stream().filter(i->i%2==1).reduce(0,(x,y)->x+y);
		System.out.println("1~100의 홀수 합:"+num);
		//					홀수 구하기			합 구하기		
		num=ex.stream().filter(i->i%2==1).reduce(0,new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		});
		System.out.println("1~100의 홀수 합:"+num);
	}
}
