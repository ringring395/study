package study;
public class SutdaCard {
	//1번
	//카드의 숫자(1~10사이의 정수)
	int num; 
	//광이면 true, 아니면 false
	boolean isKwang; 

	//2번
	//클래스명(){}
	//매개변수가 두개인 생성자
	SutdaCard(int num, boolean isKwang){
		//혼동을 줄 수 있으니, this를 입력함.
		this.num = num;
		this.isKwang = isKwang;
	}
	//매개변수가 없는 생성자 선언 : 기본생성자
	SutdaCard(){
		//기본 생성자에서 매개변수 2개짜리를 처리 가능
		this(1,true);
	} 
	String info() {
		//isKwang true이면 K입력, false면 입력X
//		if(isKwang) {
//			return num+("K");
//		}else{
//			return num+"";
//		}
		//삼항연산자로 K입력 여부 처리
		return num + (isKwang? "K" : "");

	}
	
} //SutdaCard 닫음
