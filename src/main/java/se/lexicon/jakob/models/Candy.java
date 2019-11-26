package se.lexicon.jakob.models;

public class Candy extends Product
{
    public Candy(int itemId, String name, int price, int quantity)
    {
        super(itemId, name, price, quantity);
    }

    @Override
    public String consumeProduct()
    {
        quantity--;
        return ("You eat " + getName() + " Yum Yum");
    }
}
