package main;

/**
 * @author: 特种兵—AK47
 * @创建时间：2012-6-29 上午11:03:35
 * 
 * @类说明 ：抽象迭代子角色类
 */
public interface Iterator {
	/**
	 * 迭代方法：移动到第一个元素
	 */
	public void first();

	/**
	 * 迭代方法：移动到下一个元素
	 */
	public void next();

	/**
	 * 迭代方法：是否为最后一个元素
	 */
	public boolean isDone();

	/**
	 * 迭代方法：返还当前元素
	 */
	public Object currentItem();
}
