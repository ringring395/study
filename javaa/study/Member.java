package study;
public class Member {
	//1번
	String name;		//이름
	String id;			//아이디
	String password;	//패스워드
	int age;			//나이
	//2번
//	Member(String name, String id){
//		this.name = name;
//		this.id = id;
//	}
	//3번
	boolean login(String id, String password) {
		//login메소드는 매개값id가 hong, password는 12345일때,
		if(id.equals("hong") && password.equals("12345")) {
			return true;//true로 리턴하고 
		}else {			//그 외에는 false 리턴
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}



}//Member닫음