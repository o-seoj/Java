package sub8;
/*
 * 날짜 : 2025/07/16
 * 이름 : 오서정
 * 내용 : 인터페이스 실습하기
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 역할1 - 통일된 표준 클래스 설계
		RemoteControl lg = new RemoteLG(); //업캐스팅
		lg.powerOn();
		lg.chUP();
		lg.soundDown();
		lg.powerOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundUp();
		samsung.powerOff();
		
		// 인터페이스 역할2 - 결합도 완화(유연성)
		Bulb bulb = new Bulb();
		Socket socket = new Power(bulb); //power를 업캐스팅 -> 유연성 좋아짐
		
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 역할3 - 다중 상속 효과
		SmartTv smartTv = new SmartTv(); //Tv나 Internet으로 업캐스팅 x, 둘 중에 하나로 정할 수 없기 때문에
		
		smartTv.process();
		
	}
}
