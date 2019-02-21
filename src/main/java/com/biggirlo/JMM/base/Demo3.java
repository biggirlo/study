/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.JMM.base;

/**
 * 如果我们希望 B 在 A 全部打印 完后再开始打印呢？我们可以利用 thread.join() 方法
 * @author 王雁欣
 * create on 2019/2/11 13:00 
 */
public class Demo3 {

    public static void main(String[] args){
        final Object lock = new Object();
        final Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("A 1");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A 2");
                    System.out.println("A 3");
                }
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("B 1");
                    System.out.println("B 2");
                    System.out.println("B 3");
                    lock.notify();
                }
            }
        });
        a.start();
        b.start();
    }


}
