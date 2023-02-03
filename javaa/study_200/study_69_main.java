package study_200;

public class study_69_main {
	//StringBuffer
	public static void main(String[] args) {
		//StringBuffer 생성
		StringBuffer sbf = new StringBuffer();
		//append : 계속연결
		sbf.append("KingKong ")
			.append("kick ")
			.append("the drum");
		System.out.println(sbf.toString()+"\n"+sbf.hashCode());
		//replace : 교체
		sbf.replace(0,8,"RingRing");
		System.out.println(sbf.toString()+"\n"+sbf.hashCode());
		//reverse : 뒤집기
		sbf.reverse();
		System.out.println(sbf.toString()+"\n"+sbf.hashCode());
		//delete : a부터 b-a까지 삭제
		sbf.delete(5, 9);
		System.out.println(sbf.toString()+"\n"+sbf.hashCode());
	}
}
