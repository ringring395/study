package study_200;

public class study_32 {
//1차원, 2차원 배열로 위도, 경도 표현하기
	public static void main(String[] args) {
		//lat(latitude) : 위도
		//long(longitude) : 경도
		//실수 변수
		double lat1 = 37.52127220511242;
		double long1 = 127.0074462890625;	//서울
		double lat2 = 35.137879119634185;
		double long2 = 129.04541015625; 	//부산
		System.out.println("1번, 변수 나열(서울)");
		System.out.println(lat1+"\t"+long1);
		//실수 1차원 배열
		double [] latlong1 = {lat1, long1};
		double [] latlong2 = {lat2, long2};
		System.out.println("2번, 1차원 배열(서울)");
		System.out.println(latlong1[0]+"\t"+latlong1[1]);
		//실수 2차원 배열
		double [][] latlong = {{lat1, long1}, {lat2, long2}};
		System.out.println("3번, 2차원 배열(서울)");
		System.out.println(latlong[0][0]+"\t"+latlong[0][1]);
	}
}
