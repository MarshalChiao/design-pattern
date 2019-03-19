package com.marshal.factory.simplefactory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 14:39
 * @Description:
 */

/**
 * 简单工厂模式
 * 专门定义一个类来负责创建其他类的实例，被创建的实例通常都是具有共同的父类或接口。
 */
public class Client {

    public static void main(String[] args) {
        SimpleRouJiaMoFactory simpleFactory = new SimpleRouJiaMoFactory();
        simpleFactory.createRouJiaMo("Suan");
        simpleFactory.createRouJiaMo("La");
        simpleFactory.createRouJiaMo("Tian");
    }
}
