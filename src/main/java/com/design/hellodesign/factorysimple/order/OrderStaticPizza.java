package com.design.hellodesign.factorysimple.order;

import com.design.hellodesign.factorysimple.Pizza;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author tangping
 * @title: OrderStaticPizza
 * @projectName hellodesign
 * @description: TODO
 * @date 2020/4/12 15:31
 */
public class OrderStaticPizza {

    public OrderStaticPizza(){
        do {
            String orderType = getType();
            Pizza pizza = SimpleFactory.createStaticPizza(orderType);
            if (Objects.nonNull(pizza)){
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
        new OrderStaticPizza();
    }
}
