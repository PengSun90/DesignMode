package main;


public class ServiceBImpl implements ServiceB {

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.facade.ServiceA#methodA()
	 */
	@Override
	public void methodB() {
		System.out.println("methodB--> is runing");
	}

}