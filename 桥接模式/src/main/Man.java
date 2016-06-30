package main;

public class Man implements Person {

	private RemoteControl reControl;

	public Man(RemoteControl reControl) {
		super();
		this.reControl = reControl;
	}

	@Override
	public void turnOn() {
		reControl.turnOn();
	}

	@Override
	public void turnOff() {
		reControl.turnOff();
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("Man watch use " + reControl.getClass().getSimpleName());
		reControl.setChannel(channel);
	}

}
