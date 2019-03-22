package com.marshal.template;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/22
 * @Time: Created at 14:21
 * @Description:
 */

/**
 * 模板模式  行为型模式
 * 模板模式中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 *      定义一个操作中的算法的股价，而将一些步骤延迟到子类中。
 * 涉及两个角色：
 *      抽象模板（Abstract Template）角色：
 *          1.定义一个或多个抽象操作，以便让子类实现。这些抽象操作叫做基本操作，它们是一个顶级逻辑的组成步骤。
 *          2.定义并实现一个模板方法，这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。
 *              顶级逻辑逻辑也有可能调用一些具体方法。
 *      具体模板（Concrete Template）角色：
 *          1.实现父类所定义的一个或多个抽象方法，它们是一个顶级逻辑的组成步骤。
 *          2.没一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每一个具体模板角色都可以给出这些抽象方法（也就是顶级逻辑的组成步骤）的不同实现，
 *              从而使得顶级逻辑的实现各不相同。
 */
public class Client {
}
