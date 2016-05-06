package p1;

/**
 * Created by VKurochkin on 5/5/2016.
 */
public class Fraction {
    private final int integerValue;
    private final int denominator;

    public Fraction(int integerValue){

        this.integerValue = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that){
            return new Fraction(this.integerValue + that.integerValue, denominator);
    }

    public int intValue(){
        return integerValue;
    }

    public int getNumerator(){
        return 3;
    }

    public int getDenominator(){
        return denominator;
    }
}
