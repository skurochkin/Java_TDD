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

    @Override
    public String toString(){
        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public boolean equals(Object other){

        if(other instanceof Fraction){
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;   // To change body of overridden methods use File | Settings | File
    }

    @Override
    public int hashCode(){
        return numerator*19 + denominator;
    }
}
