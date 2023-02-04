package s114;
//4배수 마방진
public class fourMagicSquare {
	private int[][] magic;	//2차원 배열 선언
	private int n;			//마방진 크기 n*n (4의배수로 설정)
	
	public int[][] getMagic(){
		return magic;
	}
	public fourMagicSquare(int n) {
		magic = new int[n][n];
		this.n = n;
	}
	public fourMagicSquare() {	//기본생성자 (기본값 : 4의배수)
		this(4);
	}
	//4배수 마방진 만들기 (A, R 순서바뀌면 false밖에 안나옴!!!)
	public void make() {
		makeA();	//makeA 메소드 호출, 1~n*n까지 순서대로 입력
		makeR();	//makeR 메소드 호출, S,T영역을 찾아 n*n~1까지 숫자 입력		
	}
	//S,T영역을 찾아 n*n~1까지 숫자 입력
	private void makeR() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i>=0 && i<n/4) || (i>=n/4*3 && i<n)) {
					if(j>=n/4 && j<n/4*3) {
						magic[i][j] = n*n-(i*n+j);
					}
				}else {	//i가 중앙
					if((j>=0 &&j<n/4) || (j>=n/4*3 && j<n)) {	//양쪽
						magic[i][j] = n*n-(i*n+j);
					}
				}
			}
		}
	}
	//1~n*n까지 순서대로 입력
	private void makeA() {
		for(int i=0; i<n*n; i++) {
			magic[i/n][i%n] = i+1;
		}
	}
	//마방진 출력 메소드는 홀수 마방진과 동일!!
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
	//col 열(열고정)에 대한 행의 합
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
			m[i] = sumRow(i);		
			m[i+n] = sumCol(i);		
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