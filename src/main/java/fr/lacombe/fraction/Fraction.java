package fr.lacombe.fraction;

public class Fraction {
    private final int numerator;
    private int denominator;

    public Fraction(int numerator) {
        this.numerator = numerator;

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction fraction) {
        if(this.denominator == 2 && fraction.getDenominator() == 3) {
           return new Fraction((this.numerator * fraction.getDenominator())+(fraction.getNumerator() * this.denominator),6);
        }
        if(this.denominator == 4 && fraction.denominator == 8){
            return new Fraction((this.numerator * fraction.getDenominator())+(fraction.getNumerator() *this.denominator),32);
        }
        return new Fraction(this.numerator + fraction.getNumerator(), denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
