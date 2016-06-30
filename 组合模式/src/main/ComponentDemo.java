package main;

import java.util.ArrayList;
import java.util.List;

public class ComponentDemo {
	public abstract class Component {
		String name;

		public abstract void add(Component c);

		public abstract void remove(Component c);

		public abstract void eachChild();
	}

	// 组合部件类
	public class Leaf extends Component {

		// 叶子节点不具备添加的能力，所以不实现
		@Override
		public void add(Component c) {
			// TODO Auto-generated method stub
			System.out.println("");
		}

		// 叶子节点不具备添加的能力必然也不能删除
		@Override
		public void remove(Component c) {
			// TODO Auto-generated method stub
			System.out.println("");
		}

		// 叶子节点没有子节点所以显示自己的执行结果
		@Override
		public void eachChild() {
			// TODO Auto-generated method stub
			System.out.println(name + "执行了");
		}

	}

	// 组合类
	public class Composite extends Component {

		// 用来保存节点的子节点
		List<Component> list = new ArrayList<Component>();

		// 添加节点 添加部件
		@Override
		public void add(Component c) {
			// TODO Auto-generated method stub
			list.add(c);
		}

		// 删除节点 删除部件
		@Override
		public void remove(Component c) {
			// TODO Auto-generated method stub
			list.remove(c);
		}

		// 遍历子节点
		@Override
		public void eachChild() {
			// TODO Auto-generated method stub
			System.out.println(name + "执行了");
			for (Component c : list) {
				c.eachChild();
			}
		}
	}
}