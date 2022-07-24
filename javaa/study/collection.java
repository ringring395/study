package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class collection {
	public static void main(String[] args) {
		//정적배열(기본타입)
//		int[] score = new int[3];
		//정적배열(객체배열)
//		student[] st = new student[3];
		Scanner s = new Scanner(System.in);
//		for(int i=0; i<st.length; i++) {
//			st[i] = new student();
//			st[i].name = s.next();
//			st[i].sum = s.nextInt();
//		}		
//		System.out.println(st[0].name+"학생의 총점은 "+st[0].sum);
//		System.out.println(st[1].name+"학생의 총점은 "+st[1].sum);
//		System.out.println(st[2].name+"학생의 총점은 "+st[2].sum);
		//동적배열(arraylist)
//		ArrayList al = new ArrayList();
		//제네릭 이용해서 정수만 저장하는 arraylist 선언
//		ArrayList<Integer> al1 = new ArrayList<>();
//		al1.add(10);
//		al1.add(20);
//		al1.add(30);
//		al1.add(40);
//		System.out.println(al1);
//		System.out.println(al1.get(0));
//		System.out.println(al1.get(1));
//		System.out.println(al1.get(2));
//		System.out.println(al1.get(3));
	
		
		//제네릭 이용해서 student에 arraylist 선언
		student st = new student();
		ArrayList<student> al2 = new ArrayList<>();
		st.name ="강호동";
		st.sum = 95;
		al2.add(st);
		st = new student();
		st.name ="이수근";
		st.sum = 100;
		al2.add(st);
		st = new student();
		st.name ="서장훈";
		st.sum = 85;
		al2.add(st);
		//System.out.println(al2.size());
//		for(int i=0; i<al2.size(); i++) {
//			System.out.println(al2.get(i).name+"학생의 총점은 "+al2.get(i).sum);
//
//		}
		
		//HashMap map = new HashMap();
		//HashMap<key,value> 변수명 = new HashMap();
		HashMap<Integer,String> map = new HashMap<>();
		//hashmap 값 추가
		map.put(1, "강호동");
		map.put(2, "이수근");
		map.put(3, "서장훈");
//		System.out.println(map);
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
			//int타입, student 객체
		HashMap<Integer,student> map2 = new HashMap<>();
		student stu2 = new student();
		//hashmap 값 추가
		stu2.name = "강호동";
		stu2.sum = 100;
		map2.put(1, stu2);
		stu2 = new student();
		stu2.name = "이수근";
		stu2.sum = 85;
		map2.put(2, stu2);
		stu2 = new student();
		stu2.name = "서장훈";
		stu2.sum = 95;
		map2.put(3, stu2);
		System.out.println(map2);
		System.out.println(map2.get(1).name);
		System.out.println(map2.get(1).sum);
		System.out.println(map2.get(2).name);
		System.out.println(map2.get(2).sum);
		System.out.println(map2.get(3).name);
		System.out.println(map2.get(3).sum);		
		
		//for문으로 출력문 반복하기
		for(int i=1; i<=map2.size(); i++) {
			System.out.println(map2.get(i).name+"학생의 총점은 "+map2.get(i).sum+"점 입니다.");
		}		
		
		
		
		
		
	}

}
