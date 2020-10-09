package com.design.hellodesign.strategy;

/**
 * @author : tangping
 * @email : tangping@7yida.com
 * @date : 2020/10/9 15:31
 * @description : 请水军增加粉丝策略
 */
public class WaterStrategy implements IIncreaseFansStrategy {

  @Override
  public void action() {
    System.out.println("请水军增加粉丝策略");
  }
}
