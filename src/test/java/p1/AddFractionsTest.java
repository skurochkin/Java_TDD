package p1;


import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by VKurochkin on 5/5/2016.
 */
public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        checkAddFractionsAsIntegers(0, 0, 0);
    }

    private void checkAddFractionsAsIntegers(int addend, int augend, int expected) {
        assertEquals(new Fraction(expected), new Fraction(addend).plus(new Fraction(augend)));
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        checkAddFractionsAsIntegers(3, 0, 3);
    }

    @Test
    public void zeroPlusNonZero() throws Exception{
        checkAddFractionsAsIntegers(0,5,5);
    }

    @Test
    public void nonNegativeNonZeroOperators() throws Exception {
        assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
    }

    @Test
    public void negativePlusNonZeroOperators() throws Exception {
        assertEquals(new Fraction (- 2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(1,5).plus(new Fraction(2,5)));
    }


}

