/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.abstractFactory.components.impl;

import com.biggirlo.design.factory.abstractFactory.components.Frame;

/**
 * BYD
 * @author 王雁欣
 * create on 2019/1/27 12:14 
 */
public class BYDFrame implements Frame{
    @Override
    public void create() {
        System.out.println("比亚迪车架");
    }
}
