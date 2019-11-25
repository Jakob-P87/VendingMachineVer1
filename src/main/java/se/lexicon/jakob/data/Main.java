package se.lexicon.jakob.data;

import se.lexicon.jakob.models.VendingMachine;

public class Main
{
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();

        /*for (int i = 0; i < vendingMachine.getProducts().length; i++)
        {
            System.out.println(vendingMachine.getProducts()[i]);
        }*/

        vendingMachine.addCurrency(100);

        System.out.println(vendingMachine.request(2).showInfo() +
                            "\n" +vendingMachine.request(11).showInfo() +
                            "\n" + vendingMachine.request(22).showInfo());

        System.out.println("Your change: " + vendingMachine.endSession());



    }
}
