package com.marshal.singleton.inner;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/18
 * @Time: Created at 19:24
 * @Description:
 */

/**
 * 单例模式 登记式/静态内部类
 * 线程安全
 * 懒加载
 * 推荐用
 * 这种方式跟饿汉式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方：
 * 饿汉式方式是只要Singleton类被装载就会实例化，
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 */
public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static final Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
