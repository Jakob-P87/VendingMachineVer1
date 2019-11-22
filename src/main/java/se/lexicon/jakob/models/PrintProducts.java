package se.lexicon.jakob.models;

import se.lexicon.jakob.interfaces.IScanner;

import java.util.Arrays;

public class PrintProducts
{
    private Candy candies;
    public void productsInSlot()
    {
        /**------------------Just to make it clean-----------*/
        Product[] drinks = {new Beverage(1, "Coca Cola", 15),
                            new Beverage(2, "Fanta", 15),
                            new Beverage(3,"Sprite", 15),
                            new Beverage(4,"Red Bull", 25)};

        Product[] snacks = {new Snacks(11, "Chips", 20),
                            new Snacks(12, "Cheese Doodles", 20),
                            new Snacks(13, "Pringles", 25)};

        Product[] candy = {new Candy(21, "Snickers", 10),
                            new Candy(22, "Twix", 10),
                            new Candy(23, "Mars", 10)};
        /**---------------------------------------------------*/

        //Have to combine all the arrays to one to search for items
        Product[][] allProducts = new Product[][]{drinks, snacks, candy};

        for (Product[] drink : allProducts)
        {
            for(Product dranks : drink)
            {
                System.out.println(dranks.showInfo());
            }
        }
    }
}
