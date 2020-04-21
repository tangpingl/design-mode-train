package com.design.hellodesign.factorysimple.order;

import com.design.hellodesign.factorysimple.Pizza;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author tangping
 * @title: OrderPizza
 * @projectName hellodesign
 * @description: 订购披萨
 * @date 2020/4/12 15:19
 */
public class OrderPizza {
    private SimpleFactory simpleFactory;
    private Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        do {
            String orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
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
        new OrderPizza(new SimpleFactory());
    }
}
