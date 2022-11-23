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
        if (this.denominator!= fraction.getDenominator()) {
            return new Fraction((this.numerator * fraction.getDenominator()) + (fraction.getNumerator() * this.denominator), fraction.getDenominator() * this.denominator);
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
