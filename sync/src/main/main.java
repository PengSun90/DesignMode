package main;


public class main {

	public static void main(String[] args) {
//	final Thread3 myt3 = new Thread3();
    final Inner inner = new Inner();
    Thread t1 = new Thread( new Runnable() {public void run() { Thread3.m4t1(inner);} }, "t1");
   Thread t2 = new Thread( new Runnable() {public void run() { Thread3.m4t2(inner);} }, "t2");
   t1.start();
   t2.start(); 
}
}
