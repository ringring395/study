package study_200;

public class study_83_main {

	public static void main(String[] args) {
		//Data를 객체로 저장
		Billboard bl = new Billboard(1,"Despacito",1,
				"../img/loopy01.png", "luis fonsi");
		//객체 출력
		showAbout(bl);
		//객체로 전달
		Billboard b = bl;	//주소 복사
		showAbout(b);		//객체 내용을 출력
	}
	//객체를 전달하여 출력
	public static void showAbout(Billboard bb) {
		String sf = String.format("%d, %s, %d, %s, %s", 
				bb.getRank(),bb.getSong(),bb.getLastweek(),
				bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);		
	}
}
