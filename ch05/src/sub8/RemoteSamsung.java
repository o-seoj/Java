package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samsung powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung powerOff...");
	}

	@Override
	public void chUP() {
		System.out.println("Samsung chUP...");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung soundDown...");
	}

}
