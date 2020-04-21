package com.design.hellodesign.factoryabstract.order;

/**
 * @author tangping
 * @title: OrderStore
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/15 21:45
 */
public class OrderStore {
    public static void main(String[] args) {
        //new OrderPizza(new BjFactory());
        new OrderPizza(new LdFactory());
    }
}
