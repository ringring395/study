package study;
public class peopleTest {
	public static void main(String[] args) {
/*		woman w = new woman();
		man m = new man();
		w.printInfo();
		m.printInfo();
 		*/	

//people참조타입으로 서로 다른 클래스 참조할 수 있기 때문에 
//아래는 다! 형! 성!
//people참조타입 p로 woman클래스 참조
		people p = new woman();	//부모가 자식1 주소 생성(小->大로 자동형변환)
		p.printInfo();
		//p.makeup();		호출 안됨
//참조형변수 p는 people타입이고, people클래스는 makeup을 갖고 있지 않기때문,
//사용해야한다면 각 참조형 타입으로 강제형변환하면 가능함
		((woman)p).makeup();
		
//people참조타입 p로 man클래스 참조		
		p = new man();			//부모가 자식2 주소도 생성(小->大로 자동형변환)
		p.printInfo();
		//p.enlist();		//호출 안됨
//참조형변수 p는 people타입이고, people클래스는 enlist을 갖고 있지 않기때문,
//사용해야한다면 각 참조형 타입으로 강제형변환하면 가능함		
		((man)p).enlist();
	}

}
