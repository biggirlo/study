/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.abstractFactory.components.impl;

import com.biggirlo.design.factory.abstractFactory.components.Circle;

/**
 *
 * @author 王雁欣
 * create on 2019/1/27 14:11 
 */
public class DZCircle implements Circle {
    @Override
    public void create() {
        System.out.println("大众轮胎");
    }
}
