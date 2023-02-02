package study_200;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Stream, map 이용
public class study_60_main {
	public static void main(String[] args) {
		List<Integer> bb = new ArrayList<>();
		int num=0;
		for(int i=1; i<=10; i++) {
			bb.add(i);
		}
		//				홀수 구하기
		bb=bb.stream().filter(i->i%2==1)
				.map(i->i*i)	//홀수의 제곱 구하기
				//홀수의 제곱을 전부 리스트에 저장
				.collect(Collectors.toList());
		//홀수의 제곱수를 출력
		bb.forEach(i->{System.out.printf(i+"\t");});
		System.out.println();
		//홀수의 제곱들의 합을 구함
		//1+9+25+49+81
		num = bb.stream().reduce(0, Integer::sum);
		System.out.println("1~10의 홀수의 제곱합:"+num);
	}
}
