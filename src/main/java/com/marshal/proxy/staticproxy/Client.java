package com.marshal.proxy.staticproxy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/20
 * @Time: Created at 13:38
 * @Description: 静态代理
 */

/**
 * 代理模式 （结构型模式）
 * 给某一个对象提供dialing对象，并由代理对象控制对源对象的引用
 * 意图：为其他对象提供一种代理以控制对这个对象的访问
 * 主要解决：在直接访问对象时带来的问题。在面向对象系统中，有些对象由于某些原因，直接访问会给使用者或者系统结构带来很多麻烦，
 * 我们可以在访问此对象时加上一个队此对象的访问层
 * 何时使用：想在访问一个类时做一些控制
 * 如何解决：增加中间层
 * 关键代码：实现与被代理类组合
 * 优点：1.职责清晰。2.高扩展性。3.智能化
 * 缺点：1.由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 *      2.实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 * 和其他模式的区别：
 *      和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口
 *      和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制
 * 代理模式中的角色有：
 *      抽象对象角色（AbstractObject）：声明了目标对象和代理对象的共同接口，这样一来在任何可以使用目标对象的地方都可以使用代理对象。
 *      目标对象角色（RealObject）：定义了代理对象所代表的目标对象。
 *      代理对象角色（ProxyObject）：
 *          代理对象内部含有目标对象的引用，从而可以在任何时候操作目标对象；
 *          代理对象提供一个与目标对象相同的接口，以便可以在任何时候替代目标对象；
 *          代理对象通常在客户端调用传递给目标对象之前或者之后，执行某个操作，而不是单纯的将调用传递给目标对象；
 * 静态代理：
 *      优点：代理使客户端不需要知道实现类是什么，怎么做，只需知道代理即可（解耦合）；不修改目标对象的前提下，扩展目标对象的功能。
 *      缺点：1.代理类和目标类实现了相同的接口，出现了大量代码重复。如增加一个方法，所有目标类和代理类都要实现此方法，增加了代码维护的复杂度。
 *            2.代理对象只服务于一种类型的对象，如果要服务多类型的对象，势必要为每一种帝乡都进行代理，静态代理在程序规模稍大时就无法胜任。
 *      解决这个缺点的方式就是使用动态代理。
 *
 */

/**
 * 静态代理
 */
public class Client {

    public static void main(String[] args) {
        AbstractObject abstractObject = new ProxyObject();
        abstractObject.operation();
    }
}
