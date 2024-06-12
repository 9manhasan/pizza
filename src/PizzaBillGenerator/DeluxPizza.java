package PizzaBillGenerator;

public class DeluxPizza extends Pizza {

    public DeluxPizza(boolean pizzatype) {
        super(pizzatype);
        super.extraCheese(true);
        super.extraToppings(true);
    }

    @Override
    public void extraCheese(boolean ans) {
        super.extraCheese(ans);
    }

    @Override
    public void extraToppings(boolean ans) {
        super.extraToppings(ans);
    }
}
