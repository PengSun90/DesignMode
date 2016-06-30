package main;

public class Client {

	public static void main(String[] args) {

		String[] objArray = { "One", "Two", "Three", "Four", "Five", "Six" };
		// 创建聚合对象
		Aggregate agg = new MyList<String>(objArray);
		// 循环输出聚合对象中的值
		Iterator it = agg.createIterator();
		while (!it.isDone()) {
			System.out.println(it.currentItem());
			it.next();
		}
	}

}
