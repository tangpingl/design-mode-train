package com.design.hellodesign.factorymethod.order;

import com.design.hellodesign.factorymethod.BJCheesePizza;
import com.design.hellodesign.factorymethod.BJGreekPizza;
import com.design.hellodesign.factorymethod.Pizza;

/**
 * @author tangping
 * @title: BjOrderPizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:57
 */
public class BjOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
