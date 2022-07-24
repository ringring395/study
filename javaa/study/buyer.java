package study;
public class buyer {	//제품을 사는사람
	int money = 1000;	//소지 금액
	product[] item =  new product[5];
	int i = 0;	//item의 인덱스 값을 i변수에 저장, item[i]
	
	//제품을 사는 기능
	void buy(product p) {
		
		System.out.println(p.toString()+"을/를 구입하셨습니다.");
		System.out.println("제품가격 : "+p.price);
		//내가 가진 금액 = 소지 금액 - 제품가격
		money -= p.price;
		System.out.println("내 잔액 : "+money);
		item[i++] = p;
	}
}