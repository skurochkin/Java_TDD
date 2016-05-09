package p1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by VKurochkin on 5/9/2016.
 */
public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }
}
