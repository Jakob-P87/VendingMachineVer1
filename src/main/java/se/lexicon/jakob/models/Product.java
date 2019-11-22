package se.lexicon.jakob.models;

public abstract class Product
{
    protected int itemId;
    protected String name;
    protected int price;
    protected int calories;

    public Product(int itemId, String name, int price)
    {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public String showInfo()
{
    return ( "Product ID: [" + getId() + "] Product: " + getName() + " Price: " + getPrice());
}

    public String consumeProduct()
    {
        return (getName() + " is no more");
    }

    public int getId()
    {
        return itemId;
    }

    public void setId(int itemId)
    {
        this.itemId = itemId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }
}
