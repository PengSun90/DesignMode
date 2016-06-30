package main;

public class MediatorImpl implements Mediator{

	private MenueA a;
	
	private MenueB b;
	
	public MediatorImpl(MenueA a, MenueB b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void affictA() {
		String food = b.getFood();
		a.setFood(food);
	}

	@Override
	public void affictB() {
		String food = a.getFood();
		b.setFood(food);
	
	}

}
