package 复合享元;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight {

	private Map<String, Flyweight> files = new HashMap<String, Flyweight>();

	/**
	 * 增加一个新的单纯享元对象到聚集中
	 */
	public void add(String state, Flyweight fly) {
		files.put(state, fly);
	}

	/**
	 * 外蕴状态作为参数传入到方法中
	 */
	@Override
	public void operation(String state) {
		Flyweight fly = null;
		for (Object o : files.keySet()) {
			fly = files.get(o);
			fly.operation(state);
		}

	}

}