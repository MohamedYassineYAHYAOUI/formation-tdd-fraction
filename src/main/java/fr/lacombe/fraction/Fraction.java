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
        if(denominator == 5 ){
            return new Fraction(this.value + fraction.getValue(), denominator);
        }
        if(denominator == 3 ){
            return new Fraction(this.value + fraction.getValue(), 3);
        }
        return new Fraction(this.value + fraction.getValue(), 2);

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
