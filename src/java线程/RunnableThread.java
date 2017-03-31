package java线程;

/**
 * 实现runnable方法
 */
public class RunnableThread implements Runnable {
    private int i;
    //run方法同样是该线程的执行体
    @Override
    public void run() {
        for (i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ":"+i);
            if(i == 2){
                RunnableThread rtt = new RunnableThread();
                new Thread(rtt,"new thread 1").start();
                new Thread(rtt,"new thread 2").start();
            }
        }

    }
}
