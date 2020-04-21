package com.design.hellodesign.factorysimple;

/**
 * @author tangping
 * @title: GreekPizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:04
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备greek 披萨");
    }
}
