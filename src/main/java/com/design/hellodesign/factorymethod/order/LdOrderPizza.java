package com.design.hellodesign.factorymethod.order;

import com.design.hellodesign.factorymethod.*;

/**
 * @author tangping
 * @title: BjOrderPizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:57
 */
public class LdOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LdCheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new LdGreekPizza();
        }
        return pizza;
    }
}
