package com.marshal.adapter.objectadapter;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2020/2/26
 * @Time: Created at 11:05
 * @Description:
 */

/**
 * 对象适配器模式
 */
public class AdapterPattern {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
