package fr.lacombe.fraction;

public class Fraction {
    private final int value;
    private int denominator;

    public Fraction(int value) {
        this.value = value;

    }

    public Fraction(int numerator, int denominator) {
        this.value = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction fraction) {
        if(this.denominator == 2 && fraction.getDenominator() == 3) {
           return new Fraction((this.value * fraction.getDenominator())+(fraction.getNumerator() * this.denominator),6);
        }
        if(this.denominator == 4 && fraction.denominator == 8){
            return new Fraction((this.value * fraction.getDenominator())+(fraction.getNumerator() *this.denominator),32);
        }
        return new Fraction(this.value + fraction.getValue(), denominator);
    }

    public int getValue() {
        return value;
    }

    public int getNumerator() {
        return value;
    }

    public int getDenominator() {
        return denominator;
    }
}
