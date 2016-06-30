package main;

public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}