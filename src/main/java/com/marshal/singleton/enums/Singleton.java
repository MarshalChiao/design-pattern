package com.marshal.singleton.enums;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/18
 * @Time: Created at 19:45
 * @Description:
 */

/**
 * 单例模式  枚举
 * 线程安全
 * 非懒加载
 * 推荐使用
 */
public enum Singleton {

    SINGLETON;

    public void method() {}


    public static void main(String[] args) {
        //访问方式
        Singleton.SINGLETON.method();
    }
}




