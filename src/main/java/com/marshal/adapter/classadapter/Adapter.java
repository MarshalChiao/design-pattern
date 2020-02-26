package com.marshal.adapter.classadapter;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2020/2/26
 * @Time: Created at 11:59
 * @Description:
 */

/**
 * 适配器
 * 继承 Adaptee，同时又实现目标接口
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        this.adapteeRequest();
    }
}
