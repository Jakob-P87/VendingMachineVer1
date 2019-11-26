package se.lexicon.jakob.models;

public class Beverage extends Product
{
    public Beverage(int itemId, String name, int price, int quantity)
    {
        super(itemId, name, price, quantity);
    }

    @Override
    public String consumeProduct()
    {
        quantity--; //Need to decrease the amount of products in vending machine slots here
        return ("You drink " + getName() + " Chug, Chug " + quantity + " Left");
    }
}
