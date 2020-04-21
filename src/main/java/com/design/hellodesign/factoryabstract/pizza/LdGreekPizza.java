package com.design.hellodesign.factoryabstract.pizza;

/**
 * @author tangping
 * @title: LdCheesePizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:51
 */
public class LdGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦希腊pizza");
        System.out.println("伦敦希腊pizza 准备工作");
    }
}
