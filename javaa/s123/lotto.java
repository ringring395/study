package s123;

import java.util.Arrays;
//로또 구성하는 클래스
public class lotto {
	private int[] lots;	//로또 번호를 담을 배열 선언
	private int base;	//기본공 45
	private int ballNum;//로또공 6
	//lotto
	//로또 공 개수와 로또 번호를 담을 배열 생성
	public lotto(int base, int ballNum) {
		this.ballNum = ballNum;
		this.base = base;
		lots = new int[ballNum];
	}
	//lotto 기본 생성자 (기본값 : 기본공45, 로또공6)
	public lotto() {
		this(45,6);
	}
	//로또 배열에 담고, 출력하기
	public void print() {
		for(int i=0; i<lots.length; i++) {
			//마지막은 콤마없이 출력
			if(i==lots.length-1) {
				System.out.printf("%d",lots[i]);
			}else {	//나머지는 콤마 붙여서출력
				System.out.printf("%d,",lots[i]);
			}
		}
		System.out.println();
	}
	//로또 번호 생성
	public void make() {
		Arrays.fill(lots, 0);	//배열을 0으로 초기화
		int count = 0;
		//배열에 서로다른 정수가 채워질 때까지
		while(count!=ballNum) {
			//임의의 정수 생성
			int temp=rand();
			//중복된 값이 아니면 로또배열에 저장하고, 저장개수 증가
			if(!contain(temp)) {
				lots[count++]=temp;
			}
		}		
		Arrays.sort(lots);	//로또 배열 정렬(오름차순)
	}
	//랜덤 숫자 생성
	private int rand() {
		return (int)(Math.random()*base)+1;
	}
	//로또 배열에 포함되어있는지 확인
	// = 중복 확인
	public boolean contain(int n) {
		boolean isC = false;
		for(int i=0; i<lots.length; i++) {
			if(lots[i]==n) {
				isC = true;
				break;
			}
		}
		return isC;
	}
	public int[] getLots() {	//로또 배열 반환
		return lots;
	}
}
