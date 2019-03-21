package com.marshal.proxy.dynamicproxy.styletwo;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 14:52
 * @Description:
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class ProxyFactory {

    //具体实现类的实例对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //为目标对象生成代理对象
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("动态代理前置内容");
                        Object result = method.invoke(target, args);
                        System.out.println("动态代理后置内容");
                        return result;
                    }
                });
    }
}
