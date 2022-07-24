package study;

public class object_arrayTest {

	public static void main(String[] args) {
		//둘중 하나의 방식
		int[] array = new int[7];
		//int[] array = {20,30,40,50,60,70,80}
		
		/* 이런식으로 배열 값을 부여.
		array[0] = 20;
		array[1] = 30;
		array[2] = 40;	*/
		
		object_array[] objarray = new object_array[7];
		//object_array[] objarray = {};
		//객체배열은 세부카테고리를 지정해서 값 부여
		objarray[0] = new object_array();
		objarray[0].name = "신사임당";
		objarray[0].score = 20;
		
		objarray[1] = new object_array();
		objarray[1].name = "이순신";
		objarray[1].score = 30;	
		
		objarray[2] = new object_array();
		objarray[2].name = "장보고";
		objarray[2].score = 40;
		
		System.out.println(objarray[0].name);
		System.out.println(objarray[0].score);
		System.out.println(objarray[1].name);
		System.out.println(objarray[1].score);
		System.out.println(objarray[2].name);
		System.out.println(objarray[2].score);
	}//메인메소드 닫음
}//object_arrayTest닫음
