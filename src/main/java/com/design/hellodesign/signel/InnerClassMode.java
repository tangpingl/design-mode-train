package com.design.hellodesign.signel;

/**
 * 单例设计模式中的内部类模式
 * 类被装载的时候内部类并不会立即被装载，所以支持懒加载的
 * 线程安全+懒加载 推荐使用
 */
public class InnerClassMode {
    private static class SingletonHolder{
        private static final InnerClassMode INSTANCE = new InnerClassMode();
    }
    private InnerClassMode(){}
    
    public static InnerClassMode getInstance() {
        return SingletonHolder.INSTANCE;

    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
