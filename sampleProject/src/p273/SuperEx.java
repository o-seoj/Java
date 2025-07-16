package p273;

class Point{
	private int x, y; //한 점을 구성하는 x, y좌표
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) { //점의 좌표 출력
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{ //Point를 상송받은 ColorPoint 선언
	private String color; //점의 색
	public ColorPoint(int x, int y, String color) {
		super(x,y); //Point 생성자의 Point(x,y)호출
		this.color = color;
	}
	public void showColorPoint() { //컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); //Point클래스의 showPoint() 호출
	}
}
public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}
}
