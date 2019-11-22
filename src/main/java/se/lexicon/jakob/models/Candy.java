package se.lexicon.jakob.models;

public class Candy extends Product
{
    public Candy(int itemId, String name, int price)
    {
        super(itemId, name, price);
    }

    @Override
    public String consumeProduct()
    {
        return ("You eat " + getName() + " Yum Yum");
    }
}
