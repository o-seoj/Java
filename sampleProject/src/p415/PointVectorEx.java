package p415;

import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>(); //Point 객체를 요소로 다루는 벡터 생성
		
		// 3개의 Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1); //인덱스 1의 Point(-5, 20) 객체 삭제
		
		//벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); //벡터의 i번째 Point 객체 얻어내기
			System.out.println(p); //p.toString()을 이용하여 갹체 p 출력
		}
	}
}
