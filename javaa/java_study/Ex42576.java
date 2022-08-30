package java_study;

import java.util.HashMap;
import java.util.Scanner;
//김수진
public class Ex42576 {
	public static void main(String[] args) {
	String answer ="";
	
	Scanner s = new Scanner(System.in);
	int man = s.nextInt();				//참가자 인원 수
	
	//hashmap사용		
	HashMap<String, Integer> hh = new HashMap<>();	
	
	//참가자 배열 선언
	String[] part = new String[man];
	//참가자 명단 입력받고 배열, 해시맵 key+1로 입력하기
	for(int i=0; i<man; i++) {
		System.out.print("참가자명단을 입력하세요>");
		part[i] = s.next();
		hh.put(part[i], hh.getOrDefault(i, 0)+1);
	}
	
	//완주자 배열 선언			무조건 하나 적다고 했으니까~
	String[] comp = new String[man-1];
	//완주자 명단 입력받고 배열, 해시맵 key-1로 입력하기
	for(int j=0; j<man-1; j++) {
		System.out.print("완주자 명단을 입력하세요>");
		comp[j] = s.next();
		hh.put(comp[j], hh.get(comp[j])-1);
	}//for문 닫음		
		
	
	//참가자+1하고 완주자-1했을때, 해쉬를 출력해봄 
	//여기에서 참가자+1만 남은사람 출력하면 됨
	//확인용
	System.out.println(hh);

	//hash 키가 1인 사람 출력해주면 됨 / hash value
	//향상된 for문사용(이거말고는 entrySet 검색해서 key/value 따로가져오는방법있음)
	for(String no_mara : hh.keySet()) {
		if(hh.get(no_mara) == 1 ) {
			answer = no_mara;
			break;
		}
	}System.out.println(answer);
	
	s.close();
	}//메인메소드 닫음
}
