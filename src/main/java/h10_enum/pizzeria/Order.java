package h10_enum.pizzeria;

import java.util.List;

public class Order {

    private PizzaSize pizzaSize;

    private List<Toppings> toppings;

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Order{" +
                "pizzaSize=" + pizzaSize +
                ", toppings=" + toppings +
                '}';
    }
}
