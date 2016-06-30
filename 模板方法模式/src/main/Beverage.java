package main;

public abstract class Beverage {

	/**
	 * 准备饮料的过程，烧水，冲泡，倒杯，搭配糕点
	 */
	final public void prepare() {
		boilWater();
		brew();
		pourInCup();
		food();
	}

	final public void boilWater() {
		System.out.println("烧水");
	}

	abstract void brew();

	final public void pourInCup() {
		System.out.println("将饮料倒入杯子里");
	}

	public void food() {
		System.out.println("搭配一点糕点");
	}

}
