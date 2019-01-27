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
import com.biggirlo.design.factory.abstractFactory.components.impl.BYDCircle;
import com.biggirlo.design.factory.abstractFactory.components.impl.BYDFrame;

/**
 *
 * @author 王雁欣
 * create on 2019/1/27 14:24 
 */
public class BYDFactory implements AbstractCarFactory {
    @Override
    public Circle createCircle() {
        Circle circle = new BYDCircle();
        circle.create();
        return circle;
    }

    @Override
    public Frame createFrame() {
        Frame frame = new BYDFrame();
        frame.create();
        return frame;
    }
}
