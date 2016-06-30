package main;

public class clend {
	public static void main(String[] args) {
		MenueA a = new MenueA("梨子");
		MenueB b = new MenueB("香蕉");
		Mediator mediator = new MediatorImpl(a, b);
		System.out.println("==========通过设置A影响B==========");
		a.setFood("苹果", mediator);
		System.out.println("MenueA的foodd值为：" + a.getFood());
		System.out.println("MenueB的foodd值为：" + b.getFood());

		System.out.println("==========通过设置B影响A==========");
		b.setFood("石榴", mediator);
		System.out.println("MenueA的foodd值为：" + a.getFood());
		System.out.println("MenueB的foodd值为：" + b.getFood());
	}
}
