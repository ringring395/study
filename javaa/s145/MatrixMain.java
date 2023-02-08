package s145;

public class MatrixMain {
	public static void main(String[] args) {
		//3행3열 생성하고 값 대입
		double [][] m1 = {{1,2,3},{2,3,4},{3,4,5}};
		//2차원 배열을 갖는 1번 행렬 생성
		Matrix mtr1 = new Matrix(m1);
		//3행3열 생성하고 값 대입
		double [][] m2 = {{-1,2,-3},{2,-3,4},{-3,4,-5}};
		//2차원 배열을 갖는 2번 행렬 생성
		Matrix mtr2 = new Matrix(m2);
		System.out.println("1번 행렬");
		mtr1.print();	//1번 행렬 출력
		System.out.println("2번 행렬");
		mtr2.print();	//2번 행렬 출력
		//1번과 값이 같은 배열(3번 행렬)을 생성 : 깊은 복사 이용
		Matrix mtr3 = mtr1.makeMatrix();
		System.out.println("3번 행렬");
		mtr3.print();	//3번 행렬 출력
		System.out.println("깊은 복사 : 내용은 일치하지만 주소는 다름");
		//깊은 복사 : 내용은 일치하지만 주소 다름
		System.out.println(mtr1.equals(mtr3));
		System.out.println("======================");
		System.out.println("행렬 연산하기");
		double [][] basic = {{1,2,3},{4,5,6},{7,8,9}};
		Matrix s0 = new Matrix(basic);
		System.out.println("기본 행렬 s0");
		s0.print();
		//연산을 위한 2차원 배열 생성
		double [][] x1 = {{0,0,1},{1,0,0},{0,1,0}};
		double [][] x2 = {{0,1,0},{0,0,1},{1,0,0}};
		//연산을 위한 2차원 배열의 객체 생성ㄴ
		Matrix mx1 = new Matrix(x1);
		Matrix mx2 = new Matrix(x2);		
		//행렬 더하기
		Matrix s1 = MatrixUtil.addMatrix(s0, mx1);
		System.out.println("더하기 : s0 + mx1");
		s1.print();
		//행렬 빼기
		Matrix s2 = MatrixUtil.diffMatrix(s0, mx2);
		System.out.println("빼기 : s0 - mx2");
		s2.print();
		//행렬 곱하기
		Matrix s3 = MatrixUtil.mulMatrix(s0, mx1);
		System.out.println("곱하기 : s0 * mx1");
		s3.print();
		//행렬 곱하기2
		Matrix s4 = MatrixUtil.mulMatrix(s0, mx2);
		System.out.println("곱하기2 : s0 * mx2");
		s4.print();
	}
}
