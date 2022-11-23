package fr.lacombe.fraction;

import java.math.BigInteger;

public class Fraction {
    private final int numerator;
    private final int denominator;

    private Fraction(int numerator) {
        this(numerator,1);
    }

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction FractionFactory(int numerator, int denominator) {
        int intGcd = computeGcd(numerator, denominator);
        return new Fraction(numerator/intGcd, denominator/intGcd);
    }

    private static int computeGcd(int numerator, int denominator) {
        BigInteger b1 = BigInteger.valueOf(numerator);
        BigInteger b2 = BigInteger.valueOf(denominator);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
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
