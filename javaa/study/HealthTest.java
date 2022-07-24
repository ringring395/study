package study;
import java.util.Scanner;
//메인메소드
public class HealthTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SubHealth he = new SubHealth();
		System.out.println("***비만도 Check***");
		System.out.print("성별(M/F) : ");
		he.gender = s.next().charAt(0);
		System.out.print("신장(Cm) : ");
		he.tall = s.nextDouble();
		System.out.print("체중(Kg)  : ");
		he.weight =s.nextDouble();
		he.output2();


		
		
	}//메인메소드 닫음
} 
