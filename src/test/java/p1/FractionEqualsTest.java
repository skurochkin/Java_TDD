package p1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by VKurochkin on 5/9/2016.
 */
public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    public void differentNumerators() throws Exception {
        assertNotEquals(new Fraction(1, 5), new Fraction(2, 5));
    }

    @Test
    public void differentDenominators() throws Exception {
        assertNotEquals(new Fraction(3, 4), new Fraction(3,7));
    }

    @Test
    public void wholeNumberEqualsSameFraction() throws Exception {
        assertEquals(new Fraction(5, 1), new Fraction(5));
    }

    @Test
    public void wholeNumberNotEqualsToDifferentWholeNumber() throws Exception {
        assertNotEquals(new Fraction(6), new Fraction(5));
    }

//    @Test
//    public void reduce() throws Exception{
//        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
//    }
}
