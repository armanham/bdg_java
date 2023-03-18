package com.bdg.h10_enum.pizzeria;

public class Test {

    public static void main(String[] args) {

        OrderService service = new OrderService();

        service.choosePizzaSize();

        service.chooseToppings();

        System.out.println(service.priceOrder());
    }
}