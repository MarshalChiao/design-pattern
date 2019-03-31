package com.marshal.factory.simplefactory;

/**
 * @Author: Shaoshuai Jiao
 * @Date: Created on 2019/3/19
 * @Time: Created at 14:13
 * @Description:
 */


public class SimpleRouJiaMoFactory {

    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if ("Suan".equals(type)) {
            System.out.println("酸味肉夹馍");
            rouJiaMo = new SuanRouJiaMo();
        } else if ("La".equals(type)) {
            System.out.println("辣味肉夹馍");
            rouJiaMo = new LaRouJiaMo();
        } else if ("Tian".equals(type)) {
            System.out.println("甜味肉夹馍");
            rouJiaMo = new TianRouJiaMo();
        } else {
            rouJiaMo = new SuanRouJiaMo();
        }
        return rouJiaMo;
    }
}
