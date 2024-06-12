package PizzaBillGenerator;

public class Pizza {
    private int Price;
    private boolean pizzatype;
    private final int extraCheesePrice =100;
    private final int extraToppingPrice = 150;
    private final int backPack = 20;
    private final int basePrice;
    private boolean isExtraCheeseAdded;
    private boolean takeawayStatus;
    private boolean isExtraToppingAdded;
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
        if(ans) {
            this.Price += extraCheesePrice;
            this.isExtraCheeseAdded = true;
        } else{
            this.isExtraCheeseAdded =  false;
        }
    }
    //add extra toppings
    public void extraToppings(boolean ans)
    {

        if(ans) {
            this.Price += extraToppingPrice;
            this.isExtraToppingAdded = true;
        } else{
            this.isExtraToppingAdded =  false;
        }
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
        System.out.println("Base price : " + this.basePrice);
        if(isExtraCheeseAdded)
        {
            System.out.println("Extra cheese added : " + this.extraCheesePrice);
        }
        if(isExtraToppingAdded)
        {
            System.out.println("Extra toppings added : " + this.extraToppingPrice);
        }
        if(takeawayStatus)
        {
            System.out.println("Packaging cost : " + this.backPack);
        }
        System.out.println("Total bill : " + this.Price);
    }
}
