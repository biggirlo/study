/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.JMM.base;

/**
 * 假设有两个线程，一个是线程 A，另一个是线程 B，两个线程分别依次打印 1-3 三个数字即可
 * @author 王雁欣
 * create on 2019/2/11 12:35 
 */
public class Demo1 {


    public static void printNumber(String threadName){
        int i = 1;
        while (i < 4){
            System.out.print(threadName + " print:" + i);
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args){
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("B");
            }
        });
        a.start();
        b.start();
    }
}
