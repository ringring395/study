package s121;
//별찍기
public class StarPoint {

	public static void main(String[] args) {
		int star = 5;	//몇줄???
		System.out.println("==별찍기 : 삼각형");
		//삼각형
		for(int i=0; i<star; i++) {	//i 값일때(0 ~ star-1)
			//j는 star-1만큼 공백 넣음(하나씩 줄어듬)
			for(int j=star-1; i<j; j--) {
				System.out.printf(" ");
			}
			//2*(i+1)은 2,4,6,8,10의 값을 가지는데
			//k는 이거보다 작아야하니 1,3,5,7,9이다
			for(int k=1; k<2*(i+1); k++) {
				System.out.printf("*");
			}
			//한줄 넣고 엔터
			System.out.println();
		}
		System.out.println("==별찍기 : 역삼각형");
		//역삼각형		
		for(int i=0; i<star; i++) {	//i 값일때(0 ~ star-1)
			//j가 i보다 작으면 공백 넣음
			for(int j=0; j<i; j++) { 
				System.out.printf(" ");
			}
			//2*(star-i)는 10,8,6,4,2의 값을 가지는데
			//k는 이거보다 작아야하니 9,7,5,3,1이다
			for(int k=1; k<2*(star-i); k++) {
				System.out.printf("*");
			}
			//한줄 넣고 엔터
			System.out.println();
		}
	}
}
