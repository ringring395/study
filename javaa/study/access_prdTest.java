package study;
import ex.access_prd;
public class access_prdTest extends access_prd {
	public static void main(String[] args) {
		access_prdTest pvd = new access_prdTest();
		pvd.Protected = 10;	//(상속으로)접근 가능
		//pvd.Default = 20;	//접근 불가
		pvd.proadd();		//(상속으로)접근 가능
		//pvd.deadd();		//접근 불가
	}//메인메소드 닫음

}
