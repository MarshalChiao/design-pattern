package com.marshal.factory.factorymethod;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 15:29
 * @Description:
 */

/**
 * 工厂方法模式（工厂模式）
 * 工厂父类（接口）负责定义产品对象的公共接口，而子类工厂负责创建具体的产品对象
 * 目的：为了把产品的实例化操作延迟到子类工厂中完成，通过工厂子类来决定究竟应该实例化哪一个产品具体对象
 * 包含四个部分：
 * 1.抽象产品：产品对象的同一的基类，或者是同一的接口
 * 2.具体的产品：各个不同的实例对象类
 * 3.抽象工厂：所有子类工厂类的基类，或是同一的接口
 * 4.具体的工厂子类：负责每个不同的产品对象的实际创建
 */
public class Client {

    public static void main(String[] args) {
        RouJiaMoStoreFactory laRouJiaMoStoreFactory = new LaRouJiaMoStoreFactory();
        SuanRouJiaMoStoreFactory suanRouJiaMoStoreFactory = new SuanRouJiaMoStoreFactory();
        RouJiaMo laRouJiaMo = laRouJiaMoStoreFactory.createRouJiaMo();
        RouJiaMo suanRouJiaMo = suanRouJiaMoStoreFactory.createRouJiaMo();
        laRouJiaMo.getName();
        suanRouJiaMo.getName();
    }
}
