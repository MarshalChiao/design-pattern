package com.marshal.proxy.staticproxy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/21
 * @Time: Created at 10:14
 * @Description: 目标对象角色
 */

public class RealObject implements AbstractObject {
    public void operation() {
        System.out.println("Do Something!");
    }
}
