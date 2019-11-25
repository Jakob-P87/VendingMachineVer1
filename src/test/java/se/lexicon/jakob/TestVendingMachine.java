package se.lexicon.jakob;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.jakob.models.VendingMachine;

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
        machine.addCurrency(100);

        assertEquals( 100, machine.getBalance());
    }
    @Test
    public void testAddCurrencyFalse()
    {
        machine.addCurrency(100);
        machine.addCurrency(97);

        assertEquals( 100, machine.getBalance());
    }

}
