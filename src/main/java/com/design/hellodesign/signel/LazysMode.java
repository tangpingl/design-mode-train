package com.design.hellodesign.signel;

/**
 *  单例模式，中的懒汉模式
 *  实现了懒加载 线程不安全的
 */
public class LazysMode {

    private LazysMode(){}

    private static LazysMode hungryMode;

    public static LazysMode getHungryMode() {
        if (hungryMode == null){
            hungryMode = new LazysMode();
        }
        return hungryMode;
    }

    public static void main(String[] args) {
       /* for (int i =0; i<100;i++){
            HungryMode hungryMode = HungryMode.getHungryMode();
            System.out.println(hungryMode);
        }*/

        for (int i = 0; i< 1000; i ++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    LazysMode hungryMode = LazysMode.getHungryMode();
                    System.out.println(hungryMode);
                }
            }).start();
        }

    }

}



