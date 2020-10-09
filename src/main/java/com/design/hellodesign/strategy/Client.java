package com.design.hellodesign.strategy;

/**
 * @author : tangping
 * @email : tangping@7yida.com
 * @date : 2020/10/9 15:36
 * @description : 策略模式客户端调用对象
 */
public class Client {

  public static void main(String[] args) {
    new FansContext(new OriginalArticleStrategy()).exec();
    new FansContext(new WaterStrategy()).exec();
  }
}
