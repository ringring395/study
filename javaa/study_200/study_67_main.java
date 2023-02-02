package study_200;

public class study_67_main {
//string 문자열 가공하기
	public static void main(String[] args) {
		String txt = "It takes 30 minutes";
		String txt2 = "IT takes 30 minutes";
		//txt의 5번째 문자열은?(0부터 시작)
		System.out.println(txt.charAt(5));			//k
		//txt의 오른쪽에 s를 붙여라
		//concat : +와 같다
		System.out.println(txt.concat("s"));		//It takes 30 minutess
		//txt의 And 문자열이 있는가?
		System.out.println(txt.contains("And"));	//false
		//txt와 txt2가 같은가?
		System.out.println(txt.equals(txt2));		//false
		//txt에서 e가 처음 확인된 위치는?(0부터 시작)	
		System.out.println(txt.indexOf("e"));		//6
		//txt에서 e가 마지막에 확인된 위치는?
		System.out.println(txt.lastIndexOf("e"));	//17
		//txt의 양쪽 공백을 제거
		System.out.println(txt.trim());				//It takes 30 minutes
		//txt의 길이는?
		System.out.println(txt.length());			//19
		//txt의 7번째부터 출력(0부터 시작함)
		System.out.println(txt.substring(7));		//s 30 minutes
		//txt의 7번째부터 (11-7)만큼 출력(0부터 시작함)
		System.out.println(txt.substring(7,11));	//s 30
		//txt의 공백을 -로 변환
		System.out.println(txt.replace(" ","-"));	//It-takes-30-minutes
		System.out.println(txt.replaceAll(" ","-"));//It-takes-30-minutes
		//txt를 모두 대문자로 변환
		System.out.println(txt.toUpperCase());		//IT TAKES 30 MINUTES
		//txt를 모두 소문자로 변환
		System.out.println(txt.toLowerCase());		//it takes 30 minutes
		//txt의 공백을 기준으로 자름 -> 배열에 넣기
		String[] sp=txt.split(" ");
		for(int i=0; i<sp.length; i++) {
							//순서_잘린문자열:길이
			System.out.println(i+"_"+sp[i]+":"+sp[i].length());
							//0_It:2
							//1_takes:5
							//2_30:2
							//3_minutes:7
		}
	}
}
