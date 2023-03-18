package com.bdg.h10_enum.pizzeria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrderService {

    private Scanner scanner = new Scanner(System.in);

    private Order order = new Order();


    /**
     * This method counts amount of order.
     *
     * @return amount of order.
     */
    public double priceOrder() {
        double sum = 0;

        sum += order.getPizzaSize().getPrice();

        for (Toppings item : order.getToppings()) {
            sum += item.getPrice();
        }
        return sum;
    }

    /**
     * This method help to select pizza size.
     */
    public void choosePizzaSize() {
        System.out.println(Arrays.toString(PizzaSize.values()));

        String pizzaSizeStr = scanner.next();
        pizzaSizeStr = pizzaSizeStr.toUpperCase();

        order.setPizzaSize(PizzaSize.valueOf(pizzaSizeStr));
    }

    /**
     * This method help to select toppings.
     */
    public void chooseToppings() {

        List<Toppings> toppings = new ArrayList<>();

        System.out.println(Arrays.toString(Toppings.values()));
        System.out.println("Select toppings: ");

        boolean more = true;
        while (more) {
            String selectorTopping = scanner.next();
            selectorTopping = selectorTopping.toUpperCase();
            toppings.add(Toppings.valueOf(selectorTopping));

            System.out.println("More toppings? Y/N");
            String answer = scanner.next();
            if (!answer.equals("Y")) {
                more = false;
            }
        }
        order.setToppings(toppings);
    }
}
