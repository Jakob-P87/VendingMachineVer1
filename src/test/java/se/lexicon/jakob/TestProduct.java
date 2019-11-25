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
        drink = new Beverage(1,"Coca Cola", 15);
    }

    @Test
    public void testGetInfo()
    {
        //Assert
        assertEquals(15, drink.getPrice());
        assertEquals("Coca Cola", drink.getName());
    }

    @Test
    public void testSetInfo()
    {
        //Act
        drink.setPrice(18);
        drink.setCalories(230);

        //Assert
        assertEquals(18, drink.getPrice());
        assertEquals(230, drink.getCalories());
    }

    @Test
    public void testSnacks()
    {
        //Arrange
    }
}
