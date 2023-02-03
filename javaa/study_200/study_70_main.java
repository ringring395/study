package study_200;

public class study_70_main {
//StringBuilder
	public static void main(String[] args) {
		//StringBuilder
		StringBuilder sbu = new StringBuilder();
		//append : 연결
		sbu.append("KingKong ")
			.append("kick ")
			.append("the drum");
		System.out.println(sbu+"\n"+sbu.hashCode());	
		//replace : 교체
		sbu.replace(14, 17, "");
		System.out.println(sbu+"\n"+sbu.hashCode());
		//reverse : 뒤집기
		sbu.reverse();
		System.out.println(sbu+"\n"+sbu.hashCode());
		//delete : 삭제
		sbu.deleteCharAt(4);
		System.out.println(sbu+"\n"+sbu.hashCode());
		sbu.delete(4, 7);
		System.out.println(sbu+"\n"+sbu.hashCode());
		//substring : 새로운 문자열 구성
		String ss = sbu.substring(0);
		System.out.println(ss);			//새로운 문자열
		System.out.println(sbu);		//builder는 변화X
		String st = sbu.substring(0,4);
		System.out.println(st);			//새로운 문자열
		System.out.println(sbu);		//builder는 변화X
	}
}
