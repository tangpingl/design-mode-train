package com.design.hellodesign.factoryabstract.pizza;

/**
 * @author tangping
 * @title: LdCheesePizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:51
 */
public class LdCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦奶酪pizza 准备工作");
    }
}
