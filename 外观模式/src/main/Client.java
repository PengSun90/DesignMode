package main;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceA sa = new ServiceAImpl();
		ServiceB sb = new ServiceBImpl();
		sa.methodA();
		sb.methodB();
		System.out.println("=====================");
		Facade f = new Facade();
		f.methodA();
		f.methodB();
		f.methodC();
	}
}