package main;

/**
 * 文件名称：Facade.java 创建人：Fei Wong 创建时间： Jun 29, 2012 电子邮箱：feiwong8@126.com
 * 
 * 外观模式 核心类
 * */

public class Facade {
	ServiceA sa;
	ServiceB sb;
	ServiceC sc;

	public Facade() {
		sa = new ServiceAImpl();
		sb = new ServiceBImpl();
		sc = new ServiceCImpl();
	}

	public void methodA() {
		sa.methodA();
		sb.methodB();
	}

	public void methodB() {
		sb.methodB();
		sc.methodC();
	}

	public void methodC() {
		sc.methodC();
		sa.methodA();
	}

}
