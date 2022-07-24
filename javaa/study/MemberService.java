package study;

public class MemberService {
	public static void main(String[] args) {
	//2번
//	Member user1 = new Member("홍길동", "hong");
//	Member user2 = new Member("강자바", "java");
//	System.out.println(user1.name);	//확인용
//	System.out.println(user1.id);	//확인용
//	System.out.println(user2.name);	//확인용
//	System.out.println(user2.id);	//확인용
	//3번
	Member mem3 = new Member();
	//Member클래스에 있는 login메서드 호출
	System.out.println(mem3.login("hong","12345"));
	mem3.logout("java");
	
	if(mem3.login("hong","12345")){
		System.out.println("로그인되었습니다.");
		mem3.logout("hong");
	}else {
		System.out.println("id또는 pw를 다시 입력하시오.");
	}
	
	
		
		
		
	}//메인메소드 닫음
}//MemberService 닫음
