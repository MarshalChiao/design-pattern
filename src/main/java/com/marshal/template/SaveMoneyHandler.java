package com.marshal.template;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/4/17
 * @Time: Created at 21:17
 * @Description:
 */

public class SaveMoneyHandler extends AbstractBusinessHandler{
    public boolean isVip() {
        return false;
    }

    public void handle() {
        System.out.println("save 1000");
    }
}
