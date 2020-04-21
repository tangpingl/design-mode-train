package com.design.hellodesign.factorymethod;

/**
 * @author tangping
 * @title: BJGreekPizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:49
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的希腊pizza ");
        System.out.println("北京的希腊pizza 准备工作");
    }
}
