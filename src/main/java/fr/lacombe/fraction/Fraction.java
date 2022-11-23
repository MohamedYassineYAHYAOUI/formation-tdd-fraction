package fr.lacombe.fraction;

import java.math.BigInteger;

public class Fraction {
    private final int numerator;
    private int denominator;

    private Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction FractionFactory(int numerator, int denominator) {
        BigInteger b1 = BigInteger.valueOf(numerator);
        BigInteger b2 = BigInteger.valueOf(denominator);
        BigInteger gcd = b1.gcd(b2);
        int intGcd = gcd.intValue();
        return new Fraction(numerator/intGcd, denominator/intGcd);
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
