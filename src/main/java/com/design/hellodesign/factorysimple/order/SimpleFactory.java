package com.design.hellodesign.factorysimple.order;

import com.design.hellodesign.factorysimple.ChessePizza;
import com.design.hellodesign.factorysimple.GreekPizza;
import com.design.hellodesign.factorysimple.Pizza;

/**
 * @author tangping
 * @title: SimpleFactory
 * @projectName hellodesign
 * @description: 简单工厂类
 * @date 2020/4/12 15:06
 */
public class SimpleFactory {
    /**
     *  根据类型返回一个Pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else if(orderType.equals("cheese")){
            pizza = new ChessePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }

    public static Pizza createStaticPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else if(orderType.equals("cheese")){
            pizza = new ChessePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}
