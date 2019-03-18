package com.marshal.singleton.lazy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/18
 * @Time: Created at 18:54
 * @Description:
 */

/**
 * 单例模式 懒汉式
 * 线程安全
 * 懒加载
 * 优点：第一次调用才初始化，避免内存浪费
 * 缺点：必须枷锁synchronized才能保证单例，但枷锁会影响效率
 */
public class SingletonSafe {

    private SingletonSafe() {}

    private static SingletonSafe instance;

    public static synchronized SingletonSafe getInstance() {
        if (instance == null) {
            instance = new SingletonSafe();
        }
        return instance;
    }


}
