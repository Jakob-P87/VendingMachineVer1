package se.lexicon.jakob.models;

import se.lexicon.jakob.interfaces.IVendingMachine;

public class VendingMachine implements IVendingMachine
{
    private Product[] allProducts = {
            new Beverage(1, "Coca Cola", 15),
            new Beverage(2, "Fanta", 15),
            new Beverage(3, "Sprite", 15),
            new Beverage(4, "Red Bull", 25),
            new Snacks(11, "Chips", 20),
            new Snacks(12, "Cheese Doodles", 20),
            new Snacks(13, "Pringles", 25),
            new Candy(21, "Snickers", 10),
            new Candy(22, "Twix", 10),
            new Candy(23, "Mars", 10),
            new Fruit(31, "Apple", 8),
            new Fruit(32, "Banana", 8),
            new Fruit(33, "Orange", 8)};

    private int currentBalance;

    @Override
    public void addCurrency(int amount)
    {
        int[] validCurrency = {1, 5, 10, 20, 50, 100, 500, 1000};

        try
        {
            for (int i = 0; i < validCurrency.length; i++)
            {
                if (validCurrency[i] == amount)
                {
                    currentBalance += amount;
                }
            }
        }catch(Exception a)
        {
            System.out.println("Invalid Amount!");
        }
        System.out.println(currentBalance);
    }

    @Override
    public Product request(int productNumber)
    {
        Product getItem = null;
        try
        {
            for (int i = 0; i < allProducts.length; i++)
            {
                if (allProducts[i].getId() == productNumber)
                {
                    if (currentBalance >= allProducts[i].getPrice())
                    {
                        getItem = allProducts[i];
                        currentBalance -= allProducts[i].getPrice();
                    }
                }
            }
        }catch(Exception a)
        {
            System.out.println("Not enough money!");
        }

        return getItem;
    }

    @Override
    public int endSession()
    {
        int returnMoney = currentBalance;
        currentBalance = 0;

        return returnMoney;
    }

    @Override
    public String getDescription(int productNumber)
    {
        String productInfo = null;

        for (int i = 0; i < allProducts.length; i++)
        {
            if (allProducts[i].getId() == productNumber)
            {
                productInfo = allProducts[i].showInfo();
            }
        }
        return productInfo;
    }

    @Override
    public int getBalance()
    {
        return currentBalance;
    }

    @Override
    public String[] getProducts()
    {
        String[] showInfo = new String[allProducts.length];

        for (int i = 0; i < allProducts.length; i++)
        {
            showInfo[i] = (" Product: [" + allProducts[i].getId() + "]" + allProducts[i].getName());
        }

        return showInfo;
    }
}
