package study;
public class object_tire_test {
//함수   	클래스선언	  리턴X	함수명	매개변수
	public static void main(String[] args) {
		//int a = 10;  (a:기본형변수 / 값을 저장)
		// ↓  ↓		↓	
		//tire fl = new tire(); (fl : 참조형변수 / 주소를 저장)
		
		//앞front 왼쪽left 타이어 
		object_tire fl = new object_tire();
		System.out.println(fl.rim);
		
		//앞front 오른쪽right 타이어
		object_tire fr = new object_tire();
		fr.rim = 20;
		object_tire.rim = 30;
		System.out.println(fr.rim);
		//뒤back 왼쪽left 타이어
		object_tire bl = new object_tire();
		//뒤back 오른쪽right 타이어
		object_tire br = new object_tire();
		object_tire.weight(10, 20);
		object_tire.transform(15);
		System.out.println(object_tire.rim);
		
		
		
		
		
		
		
		
		

	}

}
