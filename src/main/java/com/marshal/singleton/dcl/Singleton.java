package com.marshal.singleton.dcl;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/18
 * @Time: Created at 19:02
 * @Description:
 */

/**
 * 单例模式 双检锁/双重校验锁（DCL，double-checked locking）
 * 线程安全
 * 懒加载
 * 推荐用
 */
public class Singleton {

    private Singleton() {}

    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
