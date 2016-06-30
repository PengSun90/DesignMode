package main;

public class Woman implements Person {

	private RemoteControl reControl;

	public Woman(RemoteControl reControl) {
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
		System.out.println("Woman watch use " + reControl.getClass().getSimpleName());
		reControl.setChannel(channel);
	}

}
