package main;

public class main {
	public static void main(String[] args) {
		ITV tv = new SonyTV();
		RemoteControl remoteControl = new SamsungControl(tv);
		Person person = new Woman(remoteControl);
		person.setChannel(100);

		ITV tv1 = new SamsungTV();
		RemoteControl remoteControl1 = new SonyControl(tv1);
		Person person1 = new Man(remoteControl1);
		person1.setChannel(200);

	}

}
