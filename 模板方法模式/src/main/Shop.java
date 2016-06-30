package main;

public class Shop {
	public static void main(String[] args) {
		System.out.println("---茶---");
		Beverage tea = new Tea();
		tea.prepare();
		System.out.println("---咖啡---");
		Beverage coffee = new Coffee();
		coffee.prepare();
	}
}
