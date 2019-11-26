package se.lexicon.jakob.models;

public class Snacks extends Product
{
    public Snacks(int itemId, String name, int price, int quantity)
    {
        super(itemId, name, price, quantity);
    }

    @Override
    public String consumeProduct()
    {
        quantity--;
        return ("You eat " + getName() + " Crunch Crunch");
    }
}
