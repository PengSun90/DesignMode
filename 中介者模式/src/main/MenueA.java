package main;

public class MenueA implements menue {

	private String food;
	

	public MenueA(String food) {
		super();
		this.food = food;
	}



	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
		
	}



	@Override
	public void setFood(String food, Mediator mediator) {
		setFood(food);
		mediator.affictB();
		
	}

}
