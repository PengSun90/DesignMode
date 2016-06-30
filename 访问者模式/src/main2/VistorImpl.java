package main2;

public class VistorImpl implements Visitor2 {

	@Override
	public void visit(AcceptVister apple) {
		if (apple instanceof Apple) {
			System.out.print("apple 产地" + ((Apple) apple).getChandi() + "\n");
			System.out.print("apple 颜色" + ((Apple) apple).getColor() + "\n");
		}
	}

}
