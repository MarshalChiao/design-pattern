package com.marshal.Strategy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/30
 * @Time: Created at 16:59
 * @Description:
 */

/**
 * 策略模式 - 行为型模式
 * 其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。
 * 策略模式使得算法可以在不影响到客户端的情况下发生变化。
 * 涉及到三个角色：
 * 环境角色（Context）：持有一个Strategy的引用。
 *      也叫上下文，对策略进行二次封装，目的是避免高层模块对策略的直接调用。
 * 抽象策略角色（Strategy）：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 *      当各个实现类中存在这重复逻辑是，则使用抽象类来封装这部分公共的代码，此时策略模式看上去更像是模板方法模式。
 * 具体策略角色（ConcreteStrategy）：包装了相关的算法或行为。
 *
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        System.out.println("执行策略1");
        context.execute();
        context = new Context(new ConcreteStrategy2());
        System.out.println("执行策略2");
        context.execute();
        context = new Context(new ConcreteStrategy3());
        System.out.println("执行策略3");
        context.execute();

    }
}
