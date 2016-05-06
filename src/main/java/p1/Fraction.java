package p1;

/**
 * Created by VKurochkin on 5/5/2016.
 */
public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int integerValue){
      this(integerValue, 1);
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
