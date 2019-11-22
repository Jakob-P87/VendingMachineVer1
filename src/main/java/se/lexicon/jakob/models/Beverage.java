package se.lexicon.jakob.models;

public class Beverage extends Product
{
    public Beverage(int itemId, String name, int price)
    {
        super(itemId, name, price);
    }

    @Override
    public String consumeProduct()
    {
        return ("You drink " + getName() + " Chug Chug");
    }
}
