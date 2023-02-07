package s123;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//13일의 금요일
public class friday13 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		//현재 연도
		int currentyear = cal.get(Calendar.YEAR);
		int count = 0;	//13일의 금요일 카운팅
		//기준연도 2010부터 현재 연도까지 증가시키면서 for문 돌림
		for(int year=2010; year<=currentyear; year++) {
			//달마다 검색하는 for문
			for(int month=0; month<12; month++) {
				//연도랑 월에서 13일을 찾기
				cal.set(year, month, 13);
				//13일이 금요일인지 확인
				if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY) {
					System.out.println((++count)+"\t"+sdf.format(cal.getTime()));
				}//if
			}//for_month
		}//for_year
	}
}
