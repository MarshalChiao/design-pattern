package com.marshal.proxy.dynamicproxy.styleone;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 10:53
 * @Description: 动态代理
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理模式 动态代理
 * 动态代理的原理：Java的反射机制
 * 特点：
 *      代理对象不需要实现目标对象的接口，但目标对象一定要实现接口，否则不能使用动态代理
 *      代理对象的生成使用的是Java的API，动态的在内存中构建代理对象（这里指定创建代理对象/目标对象的接口的类型）。
 *      动态代理也叫JDK代理、接口代理。
 * 作用：
 *      数据库连接以及事务管理；
 *      单元测试中的动态Mock对象；
 *      自定义工厂与依赖注入容器之间的适配器；
 *      类似AOP的方法拦截器；
 *      日志、缓存等业务增强；
 *      Java RMI远程通信；
 *      各种访问控制器、验证器；
 * 动态代理类的创建：
 *      java.lang.reflect.Proxy：这是Java动态代理机制的主类，它提供了一组静态方法来为一组接口动态地生成代理类及其对象，也就是动态生成代理对象的方法。
 *      java.lang.reflect.InvocationHandler:这是调用处理器接口，它自定义了一个invoke()方法，我们在这个方法里出发代理对象自己的方法，你可以在它前后增加我们自己的增强方法。
 * 过程：每个代理类的对象都会关联一个标识内部处理逻辑的InvocationHandler接口的实现。当使用者调用了代理对象所代理的接口中的方法的时候，
 *      这个调用的信息会被传递给InvocationHandler的invoke()方法。在invoke()方法的参数中可以获取到代理对象、方法对应的Method对象和调用的实际参数。
 *      invoke()方法的返回值被返回给使用者。
 *      这种做法实际上相当于对方法调用进行了拦截。AOP的使用模式，但这种方法不需要依赖AspectJ等AOP框架。
 * JDK实现代理只需要使用 newProxyInstance方法，该方法需要接收三个参数：
 *      ClassLoader loader：指定当前目标对象使用类加载器（可为父类的类加载器），获取加载器的方法是固定的。
 *      Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方式确认类型。接口数组
 *      InvocationHandler h：事件处理。执行目标对象的方法时，会触发事件处理器的方法，会把当前执行目标对象的方法作为参数传入。方法调用处理器实例
 */
public class Client {

    public static void main(String[] args) {
        Iuser iuser = new UserImpl();
        InvocationHandler handler = new DynamicProxy(iuser);
        Iuser proxy = (Iuser) Proxy.newProxyInstance(Iuser.class.getClassLoader(), new Class[]{Iuser.class}, handler);
        proxy.eat("苹果");
    }
}
