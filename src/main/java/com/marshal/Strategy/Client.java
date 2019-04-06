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
 * 关键代码：实现同一个接口。
 * 适用场景：策略模式是一种简单常用的模式，一般来说策略模式不会单独使用，跟模板方法模式、工厂模式等混合使用的情况比较多。
 *      1.几个类的主要逻辑相同，只在部分逻辑的算法和行为上稍有区别的情况。
 *      2.有几种相似的行为，或者说算法，客户端需要动态地决定使用哪一种，那么可以使用策略模式，将这些算法封装起来供客户端调用。
 * 优点：
 *      1.算法可以自由切换。由于策略类实现自同一个抽象，所以他们之间可以自由切换。
 *      2.避免使用多重条件判断。
 *      3.扩展性良好。增加一个新的策略对策略模式来说非常容易，基本可以不改变原有代码基础上进行扩展。
 * 缺点：
 *      1.策略类会增多。维护各个策略类会给开发带来额外开销。
 *      2.所有策略类都需要对外暴露。因为使用哪种策略是由客户端来决定的，因此客户端应该知道有什么策略，并且了解各种策略之间的区别
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
