package com.design.hellodesign.signel;

/**
 *  单例设计模式 中的饿汉式
 *  再类装载的时候就创建了对象，但是没有实现懒加载
 *  是通过了类装载实现了线程安全，可能会造成内存的浪费
 *
 */
public class HungryMode {
    private HungryMode(){}

    private static HungryMode lazyMode = new HungryMode();

    public static HungryMode getLazyMode() {
        return lazyMode;
    }

    public static void main(String[] args) {
        HungryMode lazyMode = getLazyMode();
        System.out.println(lazyMode);
    }
}
