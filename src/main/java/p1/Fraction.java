package p1;

/**
 * Created by VKurochkin on 5/5/2016.
 */
public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue){
        this.denominator = 1;
        this.numerator = integerValue;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that){
            return new Fraction(this.numerator + that.numerator, denominator);
    }

    public int intValue(){
        return numerator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }
}
