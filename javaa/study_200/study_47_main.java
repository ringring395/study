package study_200;

public class study_47_main {
	//while과 조건
	public static void main(String[] args) {
		int range = 100;
		int start =1;
		int a=0, b=0, c=0;
		//a,b,c가 같지 않으면
		while(a==b || b==c || c==a) {
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
		}
		System.out.printf("%d\t%d\t%d",a,b,c);
	}
}
