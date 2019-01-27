/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.factory.simpleFactory;

/**
 * 客户端
 * @author 王雁欣
 * create on 2019/1/26 20:27 
 */
public class Client {
    public static void main(String[] args) {
        //新建一个工厂对象
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
    }
}
