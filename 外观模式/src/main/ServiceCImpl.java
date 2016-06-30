package main;

public class ServiceCImpl implements ServiceC {

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.facade.ServiceA#methodA()
	 */
	@Override
	public void methodC() {
		System.out.println("methodC--> is runing");
	}

}