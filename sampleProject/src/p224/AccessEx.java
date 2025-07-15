package p224;
class Sample{
	public int a;
	private int b;
	int c; //디폴트 접근 지정
}
public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; 
		sample.c = 10;
		
/*
 Sample 클래스의 필드 b는 private 멤버로서 Sample 클래스 외 다른 어떤 클래스에서도 읽고 쓸 수 없기 때문에 컴파일 오류 발생
 */
	}
}
