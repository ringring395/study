package s114;

public class oddMagicSquare {
	private int[][] magic;	//2차원 배열 선언
	private int n;			//마방진 크기 n*n
	
	public int[][] getMagic(){	//2차원 배열을 외부로 반환
		return magic;
	}
	public oddMagicSquare(int n) {
		magic = new int[n][n];	//2차원배열 생성, 초기화
		this.n = n;				//마방진 크기 결정
	}
	public oddMagicSquare() {	//기본 생성자, 마방진 크기 기본값 3
		this(3);		//생성자 오버로딩
	}
	//홀수 마방진 만들기
	public void make() {	
		//젤 처음 위치(0, n/2)
		int x = 0;		//가장 윗줄
		int y = n/2;	//중앙
		magic[x][y]=1;	//1~n*n 대입
		for(int i=2; i<=n*n; i++) {
			int temX = x;	//옮기기 전 위치저장
			int temY = y;
			System.out.printf("(%d,%d)\t",x,y);
			//대각선 왼쪽 위로 이동
			//x : 위로 이동
			if(x-1<0) {		//윗벽
				x=n-1;
			}else {
				x--;		
			}
			//y : 왼쪽으로 이동
			if(y-1<0) {		//왼쪽 벽
				y=n-1;
			}else {
				y--;		
			}
			//이동할 위치에 값이 이미 존재
			if(magic[x][y]!=0) {
				//아래로만 한칸 이동
				x=temX+1;			//x원위치+1
				y=temY;				//y원위치
			}
			magic[x][y]=i;			//1~n*n 대입
		}//for
	}
	public void print() {
		System.out.println(n+" is magic : "+isMagic());	//마방진 구성
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
	//row 행에 대한 열의 합
	private int sumRow(int row) {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[row][i];
		}
		return tot;
	}
	//col 열에 대한 행의 합
	private int sumCol(int col) {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[i][col];
		}
		return tot;
	}
	//역 대각선(2,0)(1,1)(0,2)
	private int sumDia() {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[i][n-1-i];
		}
		return tot;
	}
	//대각선 (0,0)(1,1)(2,2)
	private int sumReverseDia() {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[i][i];
		}
		return tot;
	}
	//마방진이 잘 되었는가 판단
	private boolean isMagic() {
		boolean isM = true;
		int[]m = new int[2*n+2];	//행수n+열수n+대각선1+역대각선1
		for(int i=0; i<n; i++) {
			m[i] = sumRow(i);		//0,1,2행의 합
			m[i+n] = sumCol(i);		//3,4,5열의 합
		}
		m[2*n] = sumReverseDia();	//역대각선의 합
		m[2*n+1] = sumDia();		//대각선의 합
		for(int i=1; i<m.length; i++) {
			if(m[0]==0 || m[0]!=m[i]) {	//한개라도 다르면 마방진 아님
				isM = false;
				break;
			}
		}
		return isM;
	}
}
