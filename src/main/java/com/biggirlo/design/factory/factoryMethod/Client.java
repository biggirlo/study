/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.factoryMethod;

import com.biggirlo.design.factory.factoryMethod.impl.CircleFactory;
import com.biggirlo.design.factory.factoryMethod.impl.RectangleFactory;
import com.biggirlo.design.factory.factoryMethod.impl.SquareFactory;

/**
 *
 * @author 王雁欣
 * create on 2019/1/26 21:27 
 */
public class Client {

    public static void main(String[] arg){

        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.getShape().draw();
        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.getShape().draw();
        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.getShape().draw();


    }

}
