package com.design.hellodesign.factorymethod;

/**
 * @author tangping
 * @title: Pizza
 * @projectName hellodesign
 * @description: 定义pizza基类 封装统一方法
 * @date 2020/4/12 13:10
 */
public abstract class Pizza {

    private String name;

    /**
     *  准备原材料可能不同 给子类自己实现
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking;");
    }
    public void cut(){
        System.out.println(name + "cuting;");
    }
    public void box(){
        System.out.println(name + "boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
