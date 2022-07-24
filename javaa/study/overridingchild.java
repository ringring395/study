package study;
//child
public class overridingchild extends overriding {
	int z;
	
	overridingchild(int x, int y, int z){
		super(x,y);	//부모 클래스의 생성자
		//super() 젤 첫줄에 있어야 오류안남
		this.z=z;
	}
	
	String getLocation() {	//오버라이딩
		return "x: "+x+", y: "+y+", z: "+z;
	}
}
