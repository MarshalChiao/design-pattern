package com.marshal.proxy.cglib;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 15:42
 * @Description:
 */

/**
 * Cglib代理
 * 是一个第三方代码生成类库，运行时在内存中动态生成一个子类对象从而实现对目标对象功能的扩展。
 * 特点：
 *      1.JDK动态代理有一个限制，就是使用动态代理的对象必须实现一个或多个接口。如果要代理没有实现接口的对象，就可以使用Cglib实现；
 *      2.cglib是一个强大的高性能的代码生成包，它可以在运行期扩展Java类与实现Java接口。它广泛的被许多AOP框架使用，例如Spring AOP和dynaop，
 *          为他们提供方法的interception（拦截）；
 *      3.cglib包的底层是通过使用一个小而快的字节码处理框架ASM，来展缓字节码并生成新的类。
 *          不鼓励直接使用ASM，因为它需要你对JVM内部结构包括class文件的格式和指令集都很熟悉。
 * cglib与动态代理最大的区别：
 *      使用动态代理的对象必须实现一个或多个接口；
 *      使用cglib代理的对象则无需实现接口，达到代理类无侵入；
 * 使用cglib需要引入cglib的jar包，如果你已经有spring-core的jar包则无需引入，因为spring中已经包含了cglib
 *
 *  <dependency>
 *     <groupId>cglib</groupId>
 *     <artifactId>cglib</artifactId>
 *     <version>3.2.5</version>
 * </dependency>
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        User target = new User();
        System.out.println(target.getClass());
        //代理对象
        User proxy = (User)new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        //执行代理对象方法
        proxy.eat("苹果");
    }
}
