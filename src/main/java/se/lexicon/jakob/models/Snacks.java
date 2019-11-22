package se.lexicon.jakob.models;

public class Snacks extends Product
{
    public Snacks(int itemId, String name, int price)
    {
        super(itemId, name, price);
    }

    @Override
    public String consumeProduct()
    {
        return ("You eat " + getName() + " Crunch Crunch");
    }
}
