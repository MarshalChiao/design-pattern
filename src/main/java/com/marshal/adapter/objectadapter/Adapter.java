package com.marshal.adapter.objectadapter;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2020/2/26
 * @Time: Created at 11:01
 * @Description:
 */

/**
 * 适配器类
 */
public class Adapter implements Target {
    // 直接关联被适配类：适配者是对象适配器的一个属性
    private Adaptee adaptee;

    // 通过构造函数传入具体需要适配的类
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.adapteeRequest();
    }
}
