package s145;
//두 행렬 연산
public class MatrixUtil {
	//더하기
	public static Matrix addMatrix(Matrix a, Matrix b) {
		int row = a.getMatrix().length;		//행 수
		int col = a.getMatrix()[0].length;	//열 수
		double [][] c = new double[row][col];//2차원 배열 생성
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				//getMatrix : 깊은 복사해서 배열 만듦
				//같은 위치 값끼리 더하기 연산하고,
				//c 배열에 넣음
				c[i][j] = a.getMatrix()[i][j]+b.getMatrix()[i][j];
			}
		}
		return new Matrix(c);
	}
	//빼기
	public static Matrix diffMatrix(Matrix a, Matrix b) {
		int row = a.getMatrix().length;		//행 수
		int col = a.getMatrix()[0].length;	//열 수
		double [][] c = new double[row][col];//2차원 배열 생성
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				//같은 위치 값끼리 빼기 연산하고,
				//c 배열에 넣음
				c[i][j] = a.getMatrix()[i][j]-b.getMatrix()[i][j];
			}
		}
		return new Matrix(c);
	}
	//곱하기
	public static Matrix mulMatrix(Matrix a, Matrix b) {
		int row = a.getMatrix().length;		//행 수
		int col = a.getMatrix()[0].length;	//열 수
		int col2 = b.getMatrix()[0].length;	//두번째 행렬 열 수
		//곱하기 연산은 
		//첫번째행*두번째열 사이즈의 행렬이 만들어짐
		double [][] c = new double[row][col2];//2차원 배열 생성
		//첫번째 배열은 행단위로 움직이고,
		for(int i=0; i<row; i++) {
			//두번째 배열은 열단위로 움직이고,
			for(int j=0; j<col2; j++) {
				//그 순서대로 
				for(int k=0; k<col; k++) {
					//싹 곱해서
					//새로운 배열에 순차적으로 저장
					c[i][j]+= a.getMatrix()[i][k]*b.getMatrix()[k][j];
				}			
			}
		}
		return new Matrix(c);
	}
}
