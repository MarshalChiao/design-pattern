package com.marshal.proxy.cglib;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 16:02
 * @Description: 目标对象，被代理对象
 */

public class User {

    public void eat(String s) {
        System.out.println("我要吃" + s);
    }
}
