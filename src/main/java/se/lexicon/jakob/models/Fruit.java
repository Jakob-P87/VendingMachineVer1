package se.lexicon.jakob.models;

public class Fruit extends Product
{
    public Fruit(int itemId, String name, int price, int quantity)
    {
        super(itemId, name, price, quantity);
    }

    @Override
    public String consumeProduct()
    {
        quantity--;
        return ("You eat " + getName() + " Crunch, Crunch");
    }
}
