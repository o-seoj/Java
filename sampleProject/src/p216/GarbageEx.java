package p216;

public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d,e;
		a = null;
		d=c;
		c=null;	
		//어떤 레퍼런스도 가리키고 있지 않는 객체나 배열이 가비지가 된다.
	}
}
