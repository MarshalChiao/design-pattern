package com.marshal.proxy.staticproxy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 10:15
 * @Description: 代理对象角色
 */

public class ProxyObject implements AbstractObject {

    private AbstractObject abstractObject = new RealObject();
    public void operation() {
        //在调用目标对象之前，完成一些操作
        System.out.println("Before Do Something!");
        abstractObject.operation();
        //在调用目标对象之后，完成一些操作
        System.out.println("After Do Something!");
    }
}
