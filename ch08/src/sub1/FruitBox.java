package sub1;

public class FruitBox<T> { //제네릭 클래스 FruitBox의 치환변수 T를 선언
	private T Fruit;
	
	public T getFruit() {
		return Fruit;
	}
	
	public void setFruit(T fruit) {
		this.Fruit = fruit;
	}
	
}
