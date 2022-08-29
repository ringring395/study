package java_study;

import java.util.HashMap;
import java.util.Scanner;

public class Ex42576 {
	public static void main(String[] args) {
	String answer ="";
	
	Scanner s = new Scanner(System.in);
	int man = s.nextInt();				//참가자 인원 수
	
	String[] participant = new String[man];
	//참가자 명단 배열
	for(int i=0; i<man; i++) {
		System.out.print("참가자 명단을 입력하세요>");
		participant[i] = s.next();
	}//for문 닫음

	String[] completion = new String[man-1];
	//완주자 명단 배열
	for(int i=0; i<man-1; i++) {
		System.out.print("완주자 명단을 입력하세요>");
		completion[i] = s.next();
	}//for문 닫음		
	s.close();
	
	//hashmap사용		
	HashMap<String, Integer> hh = new HashMap<>();	
	//참가자 명단 participant
	for(String mara : participant) hh.put(mara, hh.getOrDefault(mara, 0)+1);
	System.out.println(participant);
	
	
	//완주자 명단 completion
	for(String mara : completion) hh.put(mara, hh.get(mara)-1);
	System.out.println(completion);
	
	
	for(String key : hh.keySet()) {
		if(hh.get(key) !=0) {
			answer = key;
			System.out.println(answer);
			break;
		}
	}
	
	}
}
