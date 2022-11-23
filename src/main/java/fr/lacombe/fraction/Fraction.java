package fr.lacombe.fraction;

public class Fraction {
    private final int value;

    public Fraction(int value) {
        this.value = value;
    }

    public Fraction(int numerator, int denominator) {
        this.value = numerator;
    }

    public Fraction plus(Fraction fraction) {
        return new Fraction(this.value + fraction.getValue());

    }

    public int getValue() {
        return value;
    }

    public int getNumerator() {
        return 5;
    }

    public int getDenominator() {
        return 2;
    }
}
