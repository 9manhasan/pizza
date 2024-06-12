package PizzaBillGenerator;

public class Pizza {
    private int Price;
    private boolean pizzatype;
    private int extraCheesePrice =100;
    private int extraToppingPrice = 150;
    private int backPack = 20;
    private int basePrice;
    private boolean takeawayStatus;
    public Pizza(boolean pizzatype)
    {
        this.pizzatype = pizzatype;
        if(this.pizzatype) {
            this.Price = 300;
        }
        else {
            this.Price = 400;
        }
        this.basePrice = this.Price;
    }

    //methods
    //add extra cheese
    public void extraCheese(boolean ans)
    {

        if(ans)this.Price += extraCheesePrice;
    }
    //add extra toppings
    public void extraToppings(boolean ans)
    {

        if(ans)this.Price += extraToppingPrice;
    }
    //method for takeaway
    public void takeAway(boolean ans)
    {

        if(ans) {
            this.Price += backPack;
            this.takeawayStatus = true;
        }
        else {
            this.takeawayStatus = false;
        }
    }
    //method for bill
    public void getBill()
    {
        if(takeawayStatus)
        {
            System.out.println("Base Pizza : " + this.basePrice);
            System.out.println("Extra Cheese price : " + this.extraCheesePrice);
            System.out.println("Extra topping price : " + this.extraToppingPrice);
            System.out.println("Packaging cost : " + this.backPack);
            System.out.println("Total bill : " + this.Price);
        } else {
            System.out.println("Base Pizza : " + this.basePrice);
            System.out.println("Extra Cheese price : " + this.extraCheesePrice);
            System.out.println("Extra topping price : " + this.extraToppingPrice);
            System.out.println("Total bill : " + this.Price);
        }
    }
}
