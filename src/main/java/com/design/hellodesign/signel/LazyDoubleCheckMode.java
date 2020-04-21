package com.design.hellodesign.signel;

import java.util.Objects;

/**
 * @author tangping
 * @title: LazyDoubleCheckMode
 * @projectName hellodesign
 * @description: 懒汉模式 双重检查，线程安全，实现了懒加载，方法比较优秀
 * 使用volatile 关键字实现了线程变量的共享
 * 1、进行了两次 if null 的判断
 * 2、双重检查避免了多次同步，
 * 3、使用延迟加载提供了效率
 * @date 2020/4/1211:13
 */
public class LazyDoubleCheckMode {

    private static volatile LazyDoubleCheckMode lazyDoubleCheckMode;

    private LazyDoubleCheckMode(){}

    public static LazyDoubleCheckMode getLazyDoubleCheckMode() {
        if (Objects.isNull(lazyDoubleCheckMode)){
            synchronized (LazyDoubleCheckMode.class){
                if (Objects.isNull(lazyDoubleCheckMode)){
                    lazyDoubleCheckMode = new LazyDoubleCheckMode();
                }
            }
        }
        return lazyDoubleCheckMode;
    }
}
