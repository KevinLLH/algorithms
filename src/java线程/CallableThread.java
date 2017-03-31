package java线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过callable和Future创建线程
 * Runnable封装一个异步运行的任务，
 * 可以把它想象成为一个没有参数和返回值的异步方法。Callable与Runnable类似，但是有返回值
 *
 * 采用实现Runnable、Callable接口的方式创见多线程时，优势是：
 * 线程类只是实现了Runnable接口或Callable接口，还可以继承其他类
 * 在这种方式下，多个线程可以共享同一个target对象，所以非常适合多个相同线程来处理同一份资源的情况，
 * 从而可以将CPU、代码和数据分开，形成清晰的模型，较好地体现了面向对象的思想。
 * disadvantage
 * 编程稍微复杂，如果要访问当前线程，则必须使用Thread.currentThread()方法。
 * 使用继承Thread类的方式创建多线程时优势是：
 *  编写简单，如果需要访问当前线程，则无需使用Thread.currentThread()方法，直接使用this即可获得当前线程。
 */
public class CallableThread implements Callable<Integer>{
    public static void main(String[] args) {
        CallableThread ctt = new CallableThread();
        FutureTask<Integer> ft = new FutureTask<Integer>(ctt);
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"的循环变量i的值"+i);
            if(i==2){
                new Thread(ft,"有返回的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值"+ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Integer call() throws Exception {
        int i =0;
        for ( ; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);

        }
        return i;
    }
}
