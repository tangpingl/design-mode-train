package com.design.hellodesign.factorymethod;

/**
 * @author tangping
 * @title: BJCheesePizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:48
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println("北京的奶酪pizza  准备原材料");
    }
}
