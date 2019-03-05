package com.marshal.singleton.hungry;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/5
 * @Time: Created at 10:08
 * @Description:
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
