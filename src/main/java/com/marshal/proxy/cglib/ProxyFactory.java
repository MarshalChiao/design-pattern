package com.marshal.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 16:04
 * @Description:
 */

public class ProxyFactory implements MethodInterceptor {
    //目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //为目标对象生成代理对象
    public Object getProxyInstance() {
        //1.实例化工具类
        Enhancer en = new Enhancer();
        //2.设置父类对象
        en.setSuperclass(this.target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类，也就是代理对象
        return en.create();

    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("动态代理前置内容");
        Object result = method.invoke(target, args);
        System.out.println("动态代理后置内容");
        return result;
    }
}
