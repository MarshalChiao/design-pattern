package com.marshal.singleton.lazy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/7
 * @Time: Created at 15:31
 * @Description:
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
