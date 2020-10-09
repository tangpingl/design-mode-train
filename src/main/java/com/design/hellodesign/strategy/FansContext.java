package com.design.hellodesign.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : tangping
 * @email : tangping@7yida.com
 * @date : 2020/10/9 15:35
 * @description : 策略模式上下文对象
 */
@Data
@AllArgsConstructor
public class FansContext {

  private IIncreaseFansStrategy increaseFansStrategy;

  /**
   * 执行策略方法
   *
   * @return
   * @date : 2020/10/09 15:36
   * @description : 执行策略方法
   */
  public void exec() {
    this.increaseFansStrategy.action();
  }

}
