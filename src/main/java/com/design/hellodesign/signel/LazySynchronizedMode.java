package com.design.hellodesign.signel;

/**
 * @author tangping
 * @title: LazySynchronizedMode
 * @projectName hellodesign
 * @description: 非线程安全, 可能再多线程情况下产生多个实例 不能使用
 * @date 2020/4/1211:10
 */
public class LazySynchronizedMode {
    private LazySynchronizedMode(){}

    private static LazySynchronizedMode lazySynchronizedMode;

    public static synchronized LazySynchronizedMode getLazySyconizedMode() {
        if (lazySynchronizedMode == null){
            synchronized (LazySyconizedMode.class){
                lazySynchronizedMode = new LazySynchronizedMode();
            }
        }
        return lazySynchronizedMode;

    }
}
