/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.JMM.base;

import java.util.concurrent.CountDownLatch;

/**
 *
 * A B C 三个线程同时运行，各自独立运行完后通知 D；对 D 而言，只要 A B C 都运行完了，D 再开始运行。针对这种情况，我们可以利用 CountdownLatch 来实现这类通信方式。它的基本用法是：
 * 创建一个计数器，设置初始值，CountdownLatch countDownLatch = new CountDownLatch(2);
 * 在 等待线程 里调用 countDownLatch.await() 方法，进入等待状态，直到计数值变成 0；
 * 在 其他线程 里，调用 countDownLatch.countDown() 方法，该方法会将计数值减小 1；
 * 当 其他线程 的 countDown() 方法把计数值变成 0 时，等待线程 里的 countDownLatch.await()
 * @author 王雁欣
 * create on 2019/2/11 15:54 
 */
public class Demo4 {

    public static void main(String args[]) {
        int worker = 3;
        final CountDownLatch countDownLatch = new CountDownLatch(worker);
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("等待其他线程执行完毕");
                        try {
                            countDownLatch.await();
                            System.out.println("总线程执行完毕");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ).start();
        for (char threadName = 'A'; threadName <= 'C'; threadName++) {
            final String tN = String.valueOf(threadName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    System.out.println("执行线程" + tN);
                }
            }).start();
        }
    }
}
