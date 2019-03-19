package com.marshal.factory.abstractfactory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 17:36
 * @Description:
 */

/**
 * 惠普工厂
 */
public class HpFactory extends PcAbstractFactory {
    public Mouse createMouse() {
        return new HpMouse();
    }

    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
