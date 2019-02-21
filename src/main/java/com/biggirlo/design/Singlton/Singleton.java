/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.Singlton;

/**
 *
 * @author 王雁欣
 * create on 2019/1/29 21:41 
 */


public class Singleton {
    private Singleton() {}
    private static Singleton single=null;
    //静态工厂方法
    public static Singleton getInstance() {
        if (single == null) {
            synchronized (Singleton.class){
                if(single == null){
                    single = new Singleton();
                }
            }

        }
        return single;
    }
}
