package s180;

import java.util.Scanner;

//온도 변환
public class Temperature {
	//화씨를 섭씨로
	public static double toCel(double fah) {
		//5/9는 9로 나눈 몫이라서 0이 나옴.
		//꼭 소수점 찍어야함
		return (fah-32)*5./9;
	}
	//섭씨를 화씨로
	public static double toFah(double cel) {
		//9/5는 5로 나눈 몫이라서 1이 나옴.
		//꼭 소수점 찍어야함
		return 32+9./5*cel;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨를 화씨로 변환합니다.");
		System.out.print("섭씨를 입력하세요. >");
		double cel = sc.nextDouble();
		double fah = toFah(cel);
		System.out.printf("%.2f 섭씨= %.2f 화씨\n",cel,fah);
		System.out.println("==========");
		System.out.println("화씨를 섭씨로 변환합니다.");
		System.out.print("화씨를 입력하세요. >");
		fah = sc.nextDouble();
		cel = toCel(fah);
		System.out.printf("%.2f 화씨= %.2f 섭씨\n",fah,cel);		
	}
}
