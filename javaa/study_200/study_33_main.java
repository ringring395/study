package study_200;

public class study_33_main {
	//위도 경도를 한 묶음으로 객체에 저장
	public static void main(String[] args) {
		//lat(latitude) : 위도
		//long(longitude) : 경도
		//실수 변수
		double lat1 = 37.52127220511242;
		double long1 = 127.0074462890625;	//서울
		double lat2 = 35.137879119634185;
		double long2 = 129.04541015625; 	//부산
		//위도, 경도 객체
		study_33 spot1 = new study_33();
		spot1.lat = lat1;
		spot1.longi = long1;
		System.out.println("spot1 객체 좌표 출력(서울)");
		System.out.println(spot1.lat+"\t"+spot1.longi);
		study_33 spot2 = new study_33();
		spot2.lat = lat2;
		spot2.longi = long2;
		System.out.println("spot1 객체 좌표 출력(부산)");
		System.out.println(spot2.lat+"\t"+spot2.longi);		
		//객체 전달
		study_33 spot = spot2;	//객체의 주소값을 전달(부산 좌표 전달)
		System.out.println("객체에 대입한 주소값으로 좌표 출력");
		System.out.println(spot.lat+"\t"+spot.longi);
	}

}
