package p1;


import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by VKurochkin on 5/5/2016.
 */
public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        // dcd
    }

    @Test
    public void zeroPlusNonZero() throws Exception{
        Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperatos() throws Exception {

    }
}

