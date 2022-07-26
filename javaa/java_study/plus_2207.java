package java_study;
import java.util.ArrayList;
public class plus_2207 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		int N = (int)(Math.random()*100);
		ar.add(N);
		System.out.println(N);
		int plus = 0;
		int count = 0;
		
		while(true) {
			count++;
			
			for(int i=0; i<ar.size(); i++) {
				plus = ar.get(i)/10 + ar.get(i)%10;
				System.out.println(plus);
				ar.add(ar.get(i)%10*10 + plus%10);
				System.out.println(ar.add(i));

				if(N == ar.get(i)) {
					System.out.println(count);
					break;				
				}//if닫음

			}//for닫음

		} //while 닫음

	}//메인메소드 닫음

}
