package se.lexicon.jakob;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.jakob.data.VendingMachine;
import se.lexicon.jakob.models.Candy;

public class TestVendingMachine
{
    VendingMachine machine;

    @Before
    public void initMachine()
    {
        machine = new VendingMachine();
    }

    @Test
    public void testAddCurrency()
    {
        //Act
        machine.addCurrency(100);
        machine.addCurrency(97); //Not accepted as input

        //Assert
        assertEquals( 100, machine.getBalance());
    }

    @Test
    public void testBuyItems()
    {
        //Act
        machine.addCurrency(100);
        machine.request(1);
        machine.request(11);
        machine.request(22);
        machine.request(33);

        //Assert
        assertEquals(47,machine.getBalance());
    }

    @Test
    public void testNoItemsAvailable()
    {
        //Act
        machine.addCurrency(50);
        new Candy(5,"Banana Skid",5,0);

        //Assert
        assertNull(machine.request(5));
    }

    @Test
    public void testNoMoney()
    {
        //Assert
        assertNull(machine.request(2));
    }

    @Test
    public void testEndSession()
    {
        //Act
        machine.addCurrency(100);
        machine.request(1);

        //Assert
        assertEquals(85,machine.endSession());
        assertEquals(0,machine.getBalance());
    }

    @Test
    public void testGetAllProducts()
    {
        //Assert
        assertEquals(13, machine.getProducts().length);
    }

    @Test
    public void testGetProductInfo()
    {
        //Assert
        assertNotNull(machine.getDescription(4));
    }
}
