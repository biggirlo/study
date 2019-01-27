/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.abstractFactory;

import com.biggirlo.design.factory.abstractFactory.components.Circle;
import com.biggirlo.design.factory.abstractFactory.components.Frame;

/**
 *
 * @author 王雁欣
 * create on 2019/1/26 21:48 
 */
public interface AbstractCarFactory {

    /**
     * 创建轮胎
     * @return
     */
    public Circle createCircle();

    /**
     * 创建车架
     * @return
     */
    public Frame createFrame();

}
