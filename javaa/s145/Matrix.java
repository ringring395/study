package s145;

import java.util.Arrays;
//행렬 만들기
public class Matrix {
	private double [][] matrix;	//배열 선언
	//배열 초기화
	public Matrix(int m, int n) {
		matrix = new double[m][n];
	}
	public Matrix() {	//기본 생성자(3*3)
		this(3, 3);
	}
	public Matrix(Matrix mat) {//외부에서 행렬 입력받으면,
		this(mat.getMatrix());	//getMatrix값 가져옴
	}
	public Matrix(double[][] deep) {//2차원 배열 입력받으면,
		matrix = deepCopy(deep);	//깊은 복사
	}
	public void clear() {	//clear 메소드
		int m = matrix.length;
		for(int i=0; i<m; i++) {
			Arrays.fill(matrix[i], 0);	//배열 초기화
		}
	}
	private double[][] deepCopy(double[][] deep){
		int m = deep.length;
		int n = deep[0].length;
		double[][] paste = new double[m][n];
		for(int i=0; i<m; i++) {
			System.arraycopy(deep[i], 0, paste[i], 0, n);
		}
		return paste;
	}
	public double[][] getMatrix(){
		return deepCopy(matrix);	//깊은 복사해서 2차원 배열 반환
	}
	public Matrix makeMatrix() {	
		return new Matrix(matrix);
	}
	//2차원 배열 출력
	public void print() {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.printf("%f\t",matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------");
	}
}
