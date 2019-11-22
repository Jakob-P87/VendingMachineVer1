package se.lexicon.jakob.data;

import se.lexicon.jakob.models.PrintProducts;

public class VendingMachineInterface
{
    private PrintProducts printProducts;

    public void cantFindTheMachine()
    {
        printProducts = new PrintProducts();
        printProducts.productsInSlot();
    }
}
