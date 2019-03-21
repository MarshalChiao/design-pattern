package com.marshal.proxy.dynamicproxy.styleone;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 13:52
 * @Description:
 */

/**
 * 方法调用处理器实例
 * 实现了InvocationHandler接口的代理类（严格意义上来说并不是代理类，可以将其看作是创建代理类的必备中间环节，这是一个调用处理器。）
 *      Iuser proxy = (Iuser) Proxy.newProxyInstance(Iuser.class.getClassLoader(), new Class[]{Iuser.class}, handler);
 *      才是真正的代理类实例的创建，之前的代理实例对象仅仅是一个参数
 *
 * 动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
 * 该invoke方法返回的值是被代理接口的一个实现类
 */
public class DynamicProxy implements InvocationHandler {
    //用于接收具体实现类的实例对象
    private Object object;
    //使用带参数的构造器来传递具体实现类的对象
    public DynamicProxy(Object object) {
        this.object = object;
    }

    /**
     *
     * @param proxy 代理实例
     * @param method 调用的方法
     * @param args 方法的参数列表
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前置内容");
        Object result = method.invoke(object, args);
        System.out.println("动态代理后置内容");
        return result;
    }
}
