package study;
public class time {
	private int hour;	//시
	private int min;	//분
	private int sec;	//초
	//생성자
	time(int hour, int min, int sec){
		setHour(hour);	//수정해줌
		setMin(min);	//수정해줌
		setSec(sec);	//수정해줌
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		//시간 : 0~23시일때만 hour에 저장
		if(hour>=0 && hour<=23) {
			this.hour = hour;
		}
	}
	public int getMin() {return min;}
	public void setMin(int min) {
		//분 : 0~59분일때만 min에 저장
		if(min>=0 && min<=59) {
			this.min = min;
		}
	}
	public int getSec() {return sec;}
	public void setSec(int sec) {
		//초 : 0~59초일때만 sec에 저장
		if(sec>=0 && sec<=59) {
			this.sec = sec;
		}
	}
	
}
