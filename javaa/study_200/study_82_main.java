package study_200;

public class study_82_main {
//빌보드 차트에서 사용하는 정수와 문자열
	public static void main(String[] args) {
		int rank=1;
		String song="Despacito";
		//data를 담자
		int lastweek=1;
		String imagesrc="../img/loopy01.png";
		String artist="luis fonsi";
		String sf = String.format("%d, %s, %d, %s,%s",rank,song,lastweek,imagesrc,artist);
		System.out.println(sf);
	}

}
