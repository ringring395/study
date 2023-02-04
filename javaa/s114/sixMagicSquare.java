package s114;
//6 마방진
public class sixMagicSquare {
	 private int[][] magic;		//2차원 배열 선언
	 private int n;				//마방진 크기 n*n

	 public int[][] getMagic() {
		return magic;
	 }
	 public sixMagicSquare(int n) {
		magic=new int[n][n];
		this.n = n;
	 }
	 public sixMagicSquare() {	//기본 생성자, 마방진 크기 기본값 6
	    this(6);
	 }
	 //6 마방진 만들기
	 public void make(){
		makeA();	//makeA 메소드 호출
		makeB();	//makeB 메소드 호출
		makeCD();	//makeCD 메소드 호출
		makeMulti();//makeMulti 메소드 호출
		makeOdd();	//makeOdd 메소드 호출
	 }
	 //A영역 : 0 또는 3으로 채운다
	 private void makeA() {
		for (int i=0; i<n/2; i++) {
			for (int j=0; j<n/4; j++) {
				if(i==n/4){
					magic[i][j+1]=3;
				}else{
					magic[i][j]=3;
				}
			}
		}
	 }
	 //B영역 : 1 또는 2로 채운다
	 private void makeB() {
		for (int i=0; i<n/2; i++) {
			for (int j=0; j<n/2; j++) {
				magic[i][j+n/2]=1;
			}
		}
		for (int i=0; i<n/2; i++) {
			for (int j=0; j<n/2-(n/4-1); j++) {
				magic[i][j+n/2]=2;
			}
		}
	 }
	 //C영역 : A영역의 0,3을 3,0으로 바꾼다
	 //D영역 : B영역의 1,2를 2,1로 바꾼다
	 private void makeCD() {
		for (int i=0; i<n/2; i++) {
			for (int j=0; j<n/2; j++) {
				if(magic[i][j]==0){
					magic[i+n/2][j]=3;
				}else{
					magic[i+n/2][j]=0;
				}
				
				if(magic[i][j+n/2]==1){
					magic[i+n/2][j+n/2]=2;
				}else{
					magic[i+n/2][j+n/2]=1;
				}
			}
		}
	 }
	 private void makeMulti() {
	   for (int i=0; i<n; i++) {
		   for (int j=0; j<n; j++) {
			    magic[i][j] *= (n/2*n/2);
		   }
	   }
	 }
	// 6 마방진은 3마방진을 필요로 한다.
	private void makeOdd() {
		// Create dependency 생성의존 
		oddMagicSquare odd = new oddMagicSquare(n/2);
		odd.make();    // 3 마방진을 만든다.
		int[][] mm = odd.getMagic();
		for (int i=0; i<n/2; i++) {
			for (int j=0; j<n/2; j++) {
				magic[i][j]+=mm[i][j];		//A영역에 3마방진 더함
				magic[i][j+n/2]+=mm[i][j];	//B영역에 3마방진 더함
				magic[i+n/2][j]+=mm[i][j];	//C영역에 3마방진 더함
				magic[i+n/2][j+n/2]+=mm[i][j];//D영역에 3마방진 더함
			}
		}
	}
	//마방진 출력 메소드는 홀수 마방진&4배수 마방진과 동일!!
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
