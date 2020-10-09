package com.design.hellodesign.strategy;

/**
 * @author : tangping
 * @email : tangping@7yida.com
 * @date : 2020/10/9 15:33
 * @description : 通过认真原创增加粉丝
 */
public class OriginalArticleStrategy implements IIncreaseFansStrategy {

  @Override
  public void action() {
    System.out.println("通过认真原创增加粉丝");
  }
}
