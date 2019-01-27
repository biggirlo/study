/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.simpleFactory;

import com.biggirlo.design.factory.simpleFactory.impl.Circle;
import com.biggirlo.design.factory.simpleFactory.impl.Rectangle;
import com.biggirlo.design.factory.simpleFactory.impl.Square;

/**
 * 形状工厂
 * @author 王雁欣
 * create on 2019/1/26 20:25 
 */
public class ShapeFactory {

    /**
     * 根据类型获取
     * @param type
     * @return
     */
    public Shape getShape(String type) {
        if ("circle".equals(type)) {
            return new Circle();
        } else if ("rectangle".equals(type)) {
            return new Rectangle();
        } else if ("square".equals(type)) {
            return new Square();
        } else {
            return null;
        }
    }
}
