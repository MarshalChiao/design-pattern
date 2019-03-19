package com.marshal.factory.factorymethod;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 15:50
 * @Description:
 */

public class LaRouJiaMoStoreFactory implements RouJiaMoStoreFactory {

    public RouJiaMo createRouJiaMo() {
        return new LaRouJiaMo();
    }
}
