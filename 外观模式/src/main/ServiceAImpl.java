package main;

/**
 * 文件名称：ServiceAImpl.java 创建人：Fei Wong 创建时间： Jun 29, 2012 电子邮箱：feiwong8@126.com
 * */

public class ServiceAImpl implements ServiceA {

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.facade.ServiceA#methodA()
	 */
	@Override
	public void methodA() {
		System.out.println("methodA--> is runing");
	}

}