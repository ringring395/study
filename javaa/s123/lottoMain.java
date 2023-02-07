package s123;
//로또만들기 메인 클래스
public class lottoMain {
	public static void main(String[] args) {
		//로또 기본값
		lotto lot = new lotto(45,6);
		lot.make();	//로또 생성
		lot.print();//로또 출력
	}
}
