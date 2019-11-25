package se.lexicon.jakob.models;

public class Fruit extends Product
{
    public Fruit(int itemId, String name, int price)
    {
        super(itemId, name, price);
    }

    @Override
    public String consumeProduct()
    {
        return ("You eat " + getName() + " Crunch, Crunch");
    }
}
