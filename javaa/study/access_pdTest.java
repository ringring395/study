package study;
import ex.access_pd;
public class access_pdTest {

	public static void main(String[] args) {
		access_pd pvd = new access_pd();
		pvd.Public = 10;	//접근가능
		//pvd.Default = 20;	//(다른 패키지)접근 불가
		pvd.puadd();		//접근가능
		//pvd.deadd();		//(다른 패키지)접근 불가
		
	}//메인 메소드 닫음

}
