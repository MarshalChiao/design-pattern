package com.marshal.singleton.lazy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/7
 * @Time: Created at 15:31
 * @Description:
 */

/**
 * 单例模式 懒汉式
 * 线程不安全
 * 懒加载
 * 不可用
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}