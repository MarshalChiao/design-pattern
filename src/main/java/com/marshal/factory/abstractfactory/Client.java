package com.marshal.factory.abstractfactory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 17:19
 * @Description:
 */

/**
 * 抽象工厂模式
 * 围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * 抽象工厂模式：提供一个创建一系列相关或相互依赖的对象的接口，而且无需指定它们的具体类
 * 工厂方法模式：为某个对象提供一个接口，而且无需指定它们的具体类
 */
public class Client {

    public static void main(String[] args) {
        PcAbstractFactory hpFactory = new HpFactory();
        Mouse mouse = hpFactory.createMouse();
        mouse.sayHi();
        Keyboard keyboard = hpFactory.createKeyboard();
        keyboard.sayHi();
        PcAbstractFactory dellFactory = new DellFactory();
        Mouse mouse1 = dellFactory.createMouse();
        mouse1.sayHi();
        Keyboard keyboard1 = dellFactory.createKeyboard();
        keyboard1.sayHi();
    }
}
