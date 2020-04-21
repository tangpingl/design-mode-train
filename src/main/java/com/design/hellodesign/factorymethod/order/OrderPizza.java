package com.design.hellodesign.factorymethod.order;


import com.design.hellodesign.factorymethod.Pizza;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author tangping
 * @title: OrderPizza
 * @projectName hellodesign
 * @description: 订购披萨
 * @date 2020/4/12 15:19
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        do {
            String type = getType();
            Pizza pizza = this.createPizza(type);
            if (Objects.nonNull(pizza)){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("披萨订购失败");
                break;
            }
        }while (true);
    }

    public String getType(){
        System.out.println("请输入你要进行订购的披萨类型：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {

    }
}
