package java_study;
import java.util.HashMap;
import java.util.Scanner;
public class student_hash {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.print("학생 수를 알려주세요>");
		int student = s.nextInt();				//학생 수를 저장
		String[] name = new String[student];	//해당 수만큼 이름 배열 생성
		String[] major = new String[student];	//해당 수만큼 전공 배열 생성
		int[] grade = new int[student];			//해당 수만큼 학년 배열 생성
		for(int i=0; i<student; i++) {
			System.out.print("학과를 입력하세요>");
			major[i] = s.next();
			System.out.print("학년을 입력하세요>");
			grade[i] = s.nextInt();
		}//for문 닫음

		//hashmap사용
		//가장 많은 학과의 학생수
		HashMap<String, Integer> map = new HashMap<>();
		for(String i : major) {
			map.put(i,  map.getOrDefault(i, 0)+1);
		}
		//System.out.println("hash확인용"+map); //hash map 배열 출력 
		
		//value로 key값 찾기
		//찾고 싶은 학과 입력
		System.out.println("찾고 싶은 학과 이름");
		String searchmajor = s.next();		//찾고싶은 학과명 변수
		int searchmajorNum = 0;				//찾고싶은 학과 인원수 변수
		//찾고 싶은 학과 인원 수 출력
		for(String key : map.keySet()) {
			Integer value = map.get(searchmajor);
			searchmajorNum = value;			//찾고싶은 학과 인원수 저장.
		}System.out.println(searchmajor+"과 소속의 학생 수는 "+searchmajorNum+"입니다.");
		
		
		//가장 많은 학과 출력(최빈값)
		String modemajor = null;
		for (String i : map.keySet()) {
			if(modemajor == null || map.get(i) > map.get(modemajor)) {
				modemajor = i;
			}
		}
		System.out.println("가장 많은 학과는 "+modemajor+"입니다.");
		
		//학년 수 hashmap 정렬
		HashMap<Integer, Integer> grademap = new HashMap<>();
		for(int i : grade) {
			grademap.put(i, grademap.getOrDefault(i, 0)+1);
		}
		//System.out.println("hash확인용2"+grademap);
		//가장 많은 학년 수 출력(hashmap 이용)
		int modegrade = 0;
		for(int i : grademap.keySet()) {
			if(modegrade == 0 || grademap.get(i) > grademap.get(modegrade)) {
				modegrade = i;
			}
		}System.out.println("학생이 가장 많은 학년은 "+modegrade+"입니다.");

	}//메인메소드 닫음
} 
