/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.abstractFactory;

/**
 *
 * @author 王雁欣
 * create on 2019/1/27 14:34 
 */
public class Client {

    public static void main(String[] args){
        AbstractCarFactory byd = new BYDFactory();
        AbstractCarFactory dz = new DZFactory();

        byd.createCircle();
        byd.createFrame();
        dz.createCircle();
        dz.createFrame();

    }

}
