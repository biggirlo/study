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
public class Demo2 {


    public static void printNumber(String threadName){
        int i = 1;
        while (i < 4){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(threadName + " print:" + i);
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args){
        final Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B 开始等待 A");
                try {
                    a.join();
                }catch (Exception e){
                    e.printStackTrace();
                }

                printNumber("B");
            }
        });
        b.start();
        a.start();
    }


}
