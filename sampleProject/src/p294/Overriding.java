package p294;

class Cannon extends Weapon{
	@Override
	protected int fire() { //오버라이딩
		return 10; //대포는 한 번에 10명 살상
	}
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 "+weapon.fire());
	}
}
