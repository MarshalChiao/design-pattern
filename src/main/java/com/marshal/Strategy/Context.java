package com.marshal.Strategy;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/30
 * @Time: Created at 17:33
 * @Description: 上下文角色
 */

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doSomething();
    }
}
