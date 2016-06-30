package main2;

import main2.Visitor2;

public class Apple implements AcceptVister {
	private String color;
	private String chandi;

	public Apple(String color, String chandi) {
		super();
		this.color = color;
		this.chandi = chandi;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getChandi() {
		return chandi;
	}

	public void setChandi(String chandi) {
		this.chandi = chandi;
	}

	@Override
	public void accept(Visitor2 visitor) {
		if (visitor.getClass().getSimpleName().equals("VistorImpl")) {
			visitor.visit(this);
		}
	}
}
