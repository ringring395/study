package study;
//parent
public class overriding {
	int x;
	int y;
	
	overriding(){
		
	}
	
	overriding(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
}
