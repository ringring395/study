package s139;
//시계방향 달팽이 만들기
public class sNail {
	private int row;	//행
	private int col;	//열
	private int[][] loc;//2차원배열 선언
	//생성자
	public sNail(int row, int col) {
		super();
		this.row = row;
		this.col = col;
		loc = new int[row][col];
	}
	//make 메소드
	public void make() {
		//시작위치 0,0
		int x=0;	
		int y=0;
		int d=0;	//방향
		//행 길이만큼 for문 돌림
		for(int i=0; i<row; i++) {
			//열 길이만큼 for문 돌림
			for(int j=0; j<col; j++) {
				//배열에 숫자 넣고,
				loc[x][y] = i*col+j+1;
				if(d==0) {	//오른쪽으로 이동
					if(y+1<col && loc[x][y+1]==0) {
						y++;	//y가 1씩 증가
					}else {		//맨오른쪽이거나 숫자
						d=1;	//아래로 방향 바꾸고,
						x++;	//x증가
					}
				}else if(d==1) {	//아래로 이동
					if(x+1<col && loc[x+1][y]==0) {
						x++;	//x가 1씩 증가
					}else {		//맨아래거나 숫자
						d=2;	//왼쪽으로 방향 바꾸고,
						y--;	//y감소
					}
				}else if(d==2) {	//왼쪽으로 이동
					if(y-1>=0 && loc[x][y-1]==0) {
						y--;	//y가 1씩 감소
					}else {		//맨왼쪽이거나 숫자
						d=3;	//위로 방향 바꾸고,
						x--;	//x감소
					}
				}else if(d==3) {	//위로 이동
					if(x-1>=0 && loc[x-1][y]==0) {
						x--;	//x가 1씩 감소
					}else {		//맨위거나 숫자
						d=0;	//오른쪽으로 방향 바꾸고,
						y++;	//y증가
					}
				}
			}//for_j
		}//for_i
	}
	//2차원 배열 출력
	public void print() {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("(%2d)",loc[i][j]);
			}
			System.out.println();
		}
	}
}
