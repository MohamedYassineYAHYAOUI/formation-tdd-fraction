package fr.lacombe.fraction;

public class Fraction {
    private final int numerator;
    private int denominator;

    private Fraction(int numerator) {
        this.numerator = numerator;
    }

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction FractionFactory(int numerator, int denominator) {
        return new Fraction(numerator, denominator);
    }

    public static Fraction FractionFactory(int numerator) {
        return new Fraction(numerator);
    }

    public Fraction plus(Fraction fraction) {
        if (this.denominator!= fraction.getDenominator()) {
            return FractionFactory((this.numerator * fraction.getDenominator()) + (fraction.getNumerator() * this.denominator), fraction.getDenominator() * this.denominator);
        }
        return FractionFactory(this.numerator + fraction.getNumerator(), denominator);
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
