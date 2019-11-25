package se.lexicon.jakob.models;

import java.util.Arrays;

public class ProductsInMachine
{
    public void currentProducts()
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

        for (Product[] all : allProducts)
        {
            for (Product all2 : all)
            {
                System.out.println(all2);
            }
        }

        Arrays.toString(allProducts);
    }
}
