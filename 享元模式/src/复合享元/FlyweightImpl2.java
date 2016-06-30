package 复合享元;

public class FlyweightImpl2 implements Flyweight {

	String state = "";

	public FlyweightImpl2(String state) {
		super();
		this.state = state;
	}

	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("Intrinsic State = " + this.state);
		System.out.println("Extrinsic State = " + state);
	}

}
