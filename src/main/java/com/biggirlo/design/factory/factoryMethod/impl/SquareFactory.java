/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.factoryMethod.impl;

import com.biggirlo.design.factory.factoryMethod.ShapeFactory;
import com.biggirlo.design.factory.simpleFactory.Shape;
import com.biggirlo.design.factory.simpleFactory.impl.Square;

/**
 *
 * @author 王雁欣
 * create on 2019/1/26 21:24 
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Square();
    }
}
