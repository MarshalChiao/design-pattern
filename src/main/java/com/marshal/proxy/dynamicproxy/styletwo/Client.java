package com.marshal.proxy.dynamicproxy.styletwo;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 14:51
 * @Description: 动态代理  写法二
 */

public class Client {

    public static void main(String[] args) {
        Iuser target = new UserImpl();
        System.out.println(target.getClass());
        Iuser proxy = (Iuser) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.eat("苹果");
    }
}
