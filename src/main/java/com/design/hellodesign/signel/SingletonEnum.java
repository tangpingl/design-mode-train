package com.design.hellodesign.signel;


/**
 * 单例模式
 */
public enum SingletonEnum {
    INSTANCE;

    public static SingletonEnum testWhatever(){
        return SingletonEnum.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(testWhatever());
    }
}

