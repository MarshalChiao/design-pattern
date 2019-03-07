package com.marshal.factory;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/7
 * @Time: Created at 16:24
 * @Description:
 */

public class ShapeFactory {

    //使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
