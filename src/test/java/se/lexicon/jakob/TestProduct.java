package se.lexicon.jakob;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.jakob.models.Beverage;

public class TestProduct
{
    private Beverage drink;

    @Before
    public void initProductInfo()
    {
        drink = new Beverage(1,"Coca Cola", 15,5);

    }

    @Test
    public void testGetInfo()
    {
        //Assert
        assertEquals(15, drink.getPrice());
        assertEquals("Coca Cola", drink.getName());
        assertEquals(5,drink.getQuantity());
        assertEquals(1, drink.getId());
    }

    @Test
    public void testConsumeProduct()
    {
        //Act
        drink.consumeProduct();

        //Assert
        assertEquals(4, drink.getQuantity());
    }

    @Test
    public void testShowInfo()
    {
        assertEquals(("[" + drink.getId() + "] " + drink.getName() + " Price:" + drink.getPrice()), drink.showInfo());
    }
}
