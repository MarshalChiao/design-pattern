package com.marshal.factory.abstractfactory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 17:35
 * @Description:
 */

/**
 * 抽象工厂类
 */
public abstract class PcAbstractFactory {

    public abstract Mouse createMouse();

    public abstract Keyboard createKeyboard();
}
