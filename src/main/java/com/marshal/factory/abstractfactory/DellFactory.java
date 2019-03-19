package com.marshal.factory.abstractfactory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 17:42
 * @Description:
 */

/**
 * 戴尔工厂
 */
public class DellFactory extends PcAbstractFactory {
    public Mouse createMouse() {
        return new DellMouse();
    }

    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
