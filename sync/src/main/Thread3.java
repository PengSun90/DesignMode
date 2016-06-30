package main;

public  class Thread3 {
    public  static void m4t1(Inner inner) {
        synchronized(Thread3.class) { //使用对象锁
        System.out.println(Thread.currentThread().getName() + " : synchronized@1");
        inner.m4t1();
    }
   }
    public synchronized static void m4t2(Inner inner) {
        inner.m4t2();
}
}
    
