package p1;


import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by VKurochkin on 5/5/2016.
 */
public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception{
        assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    public void nonNegativeNonZeroOperatos() throws Exception {
        assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
    }

    @Test
    public void negativePlusNonZeroOperatos() throws Exception {
        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception {

        final Fraction sum = new Fraction(1,5).plus(new Fraction(2,5));
        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }
}

