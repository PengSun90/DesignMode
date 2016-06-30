package main;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class MenueB implements menue {

	private String food;
	

	public MenueB(String food) {
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
		mediator.affictA();
	}

}
