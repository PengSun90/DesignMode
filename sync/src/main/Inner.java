package main;

class Inner {
    public void m4t1() {
         int i = 5;
         while(i-- > 0) {
              System.out.println(Thread.currentThread().getName() + " : Inner.m4t1()=" + i);
              try {
                   Thread.sleep(500);
              } catch(InterruptedException ie) {
              }
         }
    }
    public  void m4t2() {
         int i = 5;
         while(i-- > 0) {
              System.out.println(Thread.currentThread().getName() + " : Inner.m4t2()=" + i);
              try {
                   Thread.sleep(500);
              } catch(InterruptedException ie) {
              }
         }
    }
}
