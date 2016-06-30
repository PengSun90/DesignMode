package main;

public class Context {
	private IStrategy strategy;

	// 构造函数，要你使用哪个妙计
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
}
