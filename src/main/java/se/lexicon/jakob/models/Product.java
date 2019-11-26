package se.lexicon.jakob.models;

public abstract class Product
{
    protected int itemId;
    protected String name;
    protected int price;
    protected int quantity;

    public Product(int itemId, String name, int price, int quantity)
    {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract String consumeProduct();

    public String showInfo()
    {
        return ("[" + getId() + "] " + getName() + " " + getPrice() + "KR");
    }

    public int getId()
    {
        return itemId;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }
}
