package com.marshal.singleton.hungry;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/5
 * @Time: Created at 10:08
 * @Description:
 */

/**
 * 单例模式 饿汉式
 * 线程安全
 * 非懒加载
 * 优点：实现简单，类加载的时候就完成了实例化，避免了线程的同步问题
 * 缺点：类加载时候就实例化，没有达到懒加载效果，造成内存浪费
 */
public class Singleton {

    //私有构造方法
    private Singleton() {}

    //指向自己实例的私有静态引用
    private static Singleton singleton = new Singleton();

    //以自己实例为返回值的公有静态方法
    public static Singleton getInstance() {
        return singleton;
    }
}
