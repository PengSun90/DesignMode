package main;

public class Tea extends Beverage {

	@Override
	public void food() {
		System.out.println("喝茶不需要搭配糕点");
	}

	@Override
	void brew() {
		System.out.println("冲茶");
	}

}
