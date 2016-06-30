package main;

public class USAcouster implements observer {

	@Override
	public void buyPhone(String phone) {
		System.out.println("美国人买了" + phone);
	}

}
