package com.marshal.factory.simplefactory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 14:13
 * @Description:
 */

/**
 * 简单工厂
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * 简单工厂的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品啊类（这些产品类集成自一个父类或接口）的实例。
 * 优点：工厂类是整个模式的关键。包含了必要的逻辑判断，根据外界给定的信息，决定究竟应该创建哪个具体类的对象。
 * 通过使用工厂类，外界可以从直接创建具体产品对象的尴尬局面拜托出来，而不必管这些对象究竟如何创建以及如何组织，有利于整个软件体系结构的优化。
 * 缺点：工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则。
 */
public class SimpleRouJiaMoFactory {

    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if ("Suan".equals(type)) {
            System.out.println("酸味肉夹馍");
            rouJiaMo = new SuanRouJiaMo();
        } else if ("La".equals(type)) {
            System.out.println("辣味肉夹馍");
            rouJiaMo = new LaRouJiaMo();
        } else if ("Tian".equals(type)) {
            System.out.println("甜味肉夹馍");
            rouJiaMo = new TianRouJiaMo();
        } else {
            rouJiaMo = new SuanRouJiaMo();
        }
        return rouJiaMo;
    }
}
