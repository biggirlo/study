/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.simpleFactory.impl;

import com.biggirlo.design.factory.simpleFactory.Shape;

/**
 *
 * @author 王雁欣
 * create on 2019/1/26 20:24 
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是一个正方形");
    }
}
