package com.marshal.factory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/7
 * @Time: Created at 16:28
 * @Description:
 */

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle对象并调用它的draw方法
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        //获取Rectangle对象并调用它的draw方法
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        //获取Square对象并调用它的draw方法
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
