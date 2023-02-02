package study_200;

public class study_46_main {
	//서로 다른 세 정수 만들기
	public static void main(String[] args) {
		int range = 100;
		int start =1;
		int a=0, b=0, c=0;
		while(true) {
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
			if(a!=b && b!=c && c!=a)break;
		}
		System.out.printf("%d\t%d\t%d",a,b,c);
	}
}
