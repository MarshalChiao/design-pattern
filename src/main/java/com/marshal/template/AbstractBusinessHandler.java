package com.marshal.template;

import java.util.Random;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/4/17
 * @Time: Created at 21:03
 * @Description: 模板方法抽象类
 */

public abstract class AbstractBusinessHandler {

    /**
     * 模板方法
     */
    public final void execute() {
        //如果顾客是vip，则不用排队
        if (!isVip()) {
            System.out.println("不是vip");
            getRowNumber();
        }
        handle();
        judge();
    }

    /**
     * 抽象的钩子方法，由子类实现
     *
     * @return
     */
    public abstract boolean isVip();

    /**
     * 取号
     */
    private void getRowNumber() {
        try {
            System.out.println("rowNumber-00" + Random.class.newInstance().nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 办理业务  抽象的办理业务方法，由子类实现
     */
    public abstract void handle();

    /**
     * 评价
     */
    private void judge() {
        System.out.println("give a praised");
    }
}
