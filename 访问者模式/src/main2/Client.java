package main2;

import java.applet.Applet;

public class Client {
	public static void main(String[] args) {
		Apple apple = new Apple("红色", "四川");
		VistorImpl vistorImpl = new VistorImpl();
		apple.accept(vistorImpl);
	}
}