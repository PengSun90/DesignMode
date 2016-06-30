package 单纯享元;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<String, Flyweight> files = new HashMap<String, Flyweight>();

	public Flyweight factory(String state) {
		// 先从缓存中查找对象
		Flyweight fly = files.get(state);
		if (fly == null) {
			// 如果对象不存在则创建一个新的Flyweight对象
			fly = new FlyweightImpl1(state);
			// 把这个新的Flyweight对象添加到缓存中
			files.put(state, fly);
		}
		return fly;
	}
}
