package java_study;

import java.util.Arrays;
import java.util.Scanner;

public class ex1085_sqaure {
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();	//한수의 x축 위치
		int y = s.nextInt();	//한수의 y축 위치
		int w = s.nextInt();	//왼쪽아래 꼭지점
		int h = s.nextInt();	//오른쪽위 꼭지점
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = w-x;	//한수 위치에서 x축까지
		arr[2] = y;
		arr[3] = h-y;	//한수 위치에서 y축까지
		
		Arrays.sort(arr);		//내림차순 정렬됨
		//젤 최솟값
		System.out.println(arr[0]);

	}	
}
