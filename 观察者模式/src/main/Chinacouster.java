package main;

public class Chinacouster implements observer {

	@Override
	public void buyPhone(String phone) {
		System.out.println("中国人买了" + phone);
		
	}

}
