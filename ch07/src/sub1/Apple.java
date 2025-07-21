package sub1;

public class Apple{ // 자바의 모든 클래스는 암묵적으로 Object 상속(extends Object 생략가능)
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() { 
		// 클래스 정보 출력 메서드
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
}
