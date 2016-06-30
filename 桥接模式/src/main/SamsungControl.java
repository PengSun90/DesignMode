package main;

public class SamsungControl implements RemoteControl {

	private ITV tv;

	public SamsungControl(ITV itv) {
		super();
		this.tv = itv;
	}

	@Override
	public void turnOn() {
		tv.on();
	}

	@Override
	public void turnOff() {
		tv.off();
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("SamsungControl control " + tv.getClass().getSimpleName());
		tv.switchChannel(channel);
	}

}
