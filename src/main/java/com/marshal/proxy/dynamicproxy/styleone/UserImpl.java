package com.marshal.proxy.dynamicproxy.styleone;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 13:50
 * @Description: 被代理对象
 */

public class UserImpl implements Iuser {
    public void eat(String s) {
        System.out.println("我要吃" + s);
    }
}
