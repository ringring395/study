package study;
public class pro_computer extends product{
	//기본생성자가 없어서 빨간줄 뜸
	pro_computer(){
		super(200);	//200값이 부모로가서 price로 저장됨.
	}
	public String toString() {
		return "computer";
	}
	
	
}
