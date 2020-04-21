package com.design.hellodesign.factoryabstract.order;

import com.design.hellodesign.factoryabstract.pizza.Pizza;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author tangping
 * @title: OrderPizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/15 21:39
 */
public class OrderPizza {
    AbstractFactory abstractFactory;
    public OrderPizza(AbstractFactory abstractFactory){
        setAbstractFactory(abstractFactory);
    }
    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
        Pizza pizza = null;
        do {
            String orderType = getType();
            pizza = abstractFactory.createPizza(orderType);
            if (Objects.nonNull(pizza)){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }

    public String getType(){
        System.out.println("请输入你要进行订购的披萨类型：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
