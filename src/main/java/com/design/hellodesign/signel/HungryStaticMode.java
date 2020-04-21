package com.design.hellodesign.signel;

/**
 * @author tangping
 * @title: HungryStaticMode
 * @projectName hellodesign
 * @description: 饿汉式 静态代码块写法，也存在无法实现懒加载，会对内存造成损失
 * @date 2020/4/1210:56
 */
public class HungryStaticMode {

    private HungryStaticMode(){}

    private static HungryStaticMode instance;

    static {
        instance = new HungryStaticMode();
    }

    public static HungryStaticMode getInstance() {
        return instance;
    }
}
