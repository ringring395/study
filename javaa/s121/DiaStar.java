package s121;
//다이아 별찍기
public class DiaStar {
	public static void main(String[] args) {
		//다이아몬드 별찍기
		int dia = 9;
		for(int i=0; i<dia; i++) {	//i 값일때(0 ~ dia-1)
			//Math.abs : 절댓값
			//(i-dia/2)는 -4.5, -3.5, -2.5, -1.5, -0.5,
			//0.5, 1.5, 2.5, 3.5인데 이 값들의 절댓값을 구한다
			//순서대로 4,3,2,1,0,1,2,3,4 만큼 공백을 넣는다
			for(int j=0; j<Math.abs(i-dia/2); j++) {
				System.out.printf(" ");
			}
			//dia-2*절댓값
			//절댓값은 위에서 구한 걸 활용하면 됨
			//순서대로 1,3,57,9,7,5,3,1 만큼 별 넣는다
			for(int k=0; k<dia-2*Math.abs(i-dia/2); k++) {
				System.out.printf("*");
			}
			//한줄 넣고 엔터
			System.out.println();
		}
	}
}
