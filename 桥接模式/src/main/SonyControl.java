package main;

public class SonyControl implements RemoteControl {

	private ITV tv;

	public SonyControl(ITV itv) {
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
		System.out.println("SonyControl control " + tv.getClass().getSimpleName());
		tv.switchChannel(channel);
	}

}
