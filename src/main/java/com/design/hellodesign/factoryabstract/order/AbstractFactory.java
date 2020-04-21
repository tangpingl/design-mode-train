package com.design.hellodesign.factoryabstract.order;

import com.design.hellodesign.factoryabstract.pizza.Pizza;

/**
 * @author tangping
 * @title: AbstractFactory
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/15 21:36
 */
public interface AbstractFactory {
    /**
     *  抽象工厂创建pizza方法
     * @param orderType order 类型
     * @return
     */
    Pizza createPizza(String orderType);
}
