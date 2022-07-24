package study;
//2번 자식클래스
public class SubHealth extends Health{
	//속성(static X : 3개 모두 인스턴스 변수)
	double s_weight;	//표준체중
	double fat;			//비만도
	String result;		//결과값
	//생성자
	SubHealth(){		//매개변수 없는 기본 생성자
		s_weight = 0.0;
		fat = 0.0;
		result = null;
	}
	//메소드
	String calculate() {
		super.input(gender, tall, weight);
		//남녀표준체중 구하기
		if(gender == 'M') {			//남성 표준 체중
			s_weight = (tall-100)*0.9;	
		}else if(gender =='F') {	//여성 표준 체중
			s_weight = (tall-100)*0.85;	
		}
		//비만도 계산하기
		fat = Math.round((weight/s_weight*100*100)/100.0);	//비만도
		if(fat<=90) {	//저체중
			result = "저체중";
		}else if(fat>=91 && fat<=110) {	//정상(표준체중)
			result = "정상(표준체중)";
		}else if(fat>=111 && fat<=120) {//과체중
			result = "과체중";
		}else if(fat>=121 && fat<=130) {//경도비만
			result = "경도비만";
		}else if(fat>=131 && fat<=150) {//중도비만
			result = "중도비만";
		}else if(fat>=150) {//고도비만
			result = "고도비만";
		}
		return "당신은 비만도 "+fat+"이고, "+result+"입니다." ;
		//System.out.println("당신은 비만도 "+fat+"이고, "+result+"입니다.");
	}
	
	void output2() {
		super.output1();
		System.out.println(calculate());
		//calculate에 출력문 넣고, 
		//output2에 calculate();호출 넣거나 
	}
	
	
}//자식클래스닫음
