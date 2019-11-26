package se.lexicon.jakob.data;

import se.lexicon.jakob.interfaces.IVendingMachine;
import se.lexicon.jakob.models.*;

public class VendingMachine implements IVendingMachine
{
    /**
     * --------------------Products in the machine----------------
     */
    private Product[] allProducts = {
            //Every 10 positions in the machine is defined as different kinds of products to make it more clear
            /*----------- 1-10 Drinks in the machine------------*/
            new Beverage(1, "Coca Cola", 15, 5),
            new Beverage(2, "Fanta", 15, 5),
            new Beverage(3, "Sprite", 15, 5),
            new Beverage(4, "Red Bull", 25, 5),
            /*----------- 11-20 Snacks in the machine------------*/
            new Snacks(11, "Chips", 20, 5),
            new Snacks(12, "Cheese Doodles", 20, 5),
            new Snacks(13, "Pringles", 25, 5),
            /*----------- 21-30 Candy in the machine-------------*/
            new Candy(21, "Snickers", 10, 5),
            new Candy(22, "Twix", 10, 5),
            new Candy(23, "Mars", 10, 5),
            /*----------- 31-40 Fruit in the machine-------------*/
            new Fruit(31, "Apple", 8, 5),
            new Fruit(32, "Banana", 8, 5),
            new Fruit(33, "Orange", 8, 5)};
    /**
     * -----------------------------------------------------------
     */

    private int currentBalance;

    @Override
    public void addCurrency(int amount)
    {
        int[] validCurrency = {1, 5, 10, 20, 50, 100, 500, 1000};

        for (int i = 0; i < validCurrency.length; i++)
        {
            if (validCurrency[i] == amount)
            {
                currentBalance += amount;
            }
        }
    }

    @Override
    public Product request(int productNumber)
    {
        for (int i = 0; i < allProducts.length; i++)
        {
            if (allProducts[i].getId() == productNumber)
            {
                if (currentBalance >= allProducts[i].getPrice() && allProducts[i].getQuantity() > 0)
                {
                    currentBalance -= allProducts[i].getPrice();
                    allProducts[i].consumeProduct();
                    return allProducts[i];
                }
            }
        }
        return null;
    }

    @Override
    public int endSession()
    {
        int returnChange = currentBalance;
        currentBalance = 0;

        return returnChange;
    }

    @Override
    public String getDescription(int productNumber)
    {
        String productInfo;

        for (int i = 0; i < allProducts.length; i++)
        {
            if (allProducts[i].getId() == productNumber)
            {
                productInfo = allProducts[i].showInfo();
                return productInfo;
            }
        }
        return null;
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
            showInfo[i] = (" Product: [ID:" + allProducts[i].getId() + "]" + allProducts[i].getName());
        }

        return showInfo;
    }
}
