package com.design.hellodesign.factoryabstract.order;

import com.design.hellodesign.factoryabstract.pizza.*;

/**
 * @author tangping
 * @title: BjFactory
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/15 21:37
 */
public class LdFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LdCheesePizza();
        } else if ("greek".equals(orderType)) {
            pizza = new LdGreekPizza();
        }
        return pizza;
    }
}
