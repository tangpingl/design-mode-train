package com.design.hellodesign.signel;

/**
 * @author tangping
 * @title: LazySyconizedMode
 * @projectName hellodesign
 * @description: 懒汉式线程安全，锁住整个方法效率很低
 * @date 2020/4/1211:05
 */
public class LazySyconizedMode {

    private LazySyconizedMode(){}

    private static LazySyconizedMode lazySyconizedMode;

    /**
     *  加入synchronized 悲观锁
     *  同步，线程便安全
     *  同步会进行阻塞
     * @return
     */
    public static synchronized LazySyconizedMode  getLazySyconizedMode() {
        if (lazySyconizedMode == null)
            lazySyconizedMode = new LazySyconizedMode();
        return lazySyconizedMode;
    }
}
