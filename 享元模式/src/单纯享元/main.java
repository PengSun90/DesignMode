package 单纯享元;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory("a");
		fly.operation("First Call");

		fly = factory.factory("b");
		fly.operation("Second Call");

		fly = factory.factory("a");
		fly.operation("Third Call");
	}

}
