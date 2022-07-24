package study;
//public vs. private TEST
public class access_PPTest {
	public static void main(String[] args) {
		access_PP pvp = new access_PP();
		pvp.Public = 10;	//접근 가능
		//pvp.Private = 20;	//접근 불가
		pvp.puadd();
		//pvp.pradd();
	}

}
