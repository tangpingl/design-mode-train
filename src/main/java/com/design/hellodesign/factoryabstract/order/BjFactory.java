package com.design.hellodesign.factoryabstract.order;

import com.design.hellodesign.factoryabstract.pizza.BJCheesePizza;
import com.design.hellodesign.factoryabstract.pizza.BJGreekPizza;
import com.design.hellodesign.factoryabstract.pizza.Pizza;

/**
 * @author tangping
 * @title: BjFactory
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/15 21:37
 */
public class BjFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("greek".equals(orderType)) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
