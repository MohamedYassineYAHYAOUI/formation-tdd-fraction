package fr.lacombe.fraction;

import java.math.BigInteger;

public class Fraction {
    private static final int DEFAULT_DENOMINATOR = 1;
    private final int numerator;
    private final int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private Fraction(int numerator) {
        this(numerator, DEFAULT_DENOMINATOR);
    }

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction create(int numerator) {
        return new Fraction(numerator);
    }

    public static Fraction create(int numerator, int denominator) {
        Fraction fraction = new Fraction(numerator, denominator).simplified();
        if (denominator < 0) {
            return fraction.inverse();
        }
        return fraction;
    }

    private Fraction inverse() {
        return new Fraction(-numerator, -denominator);
    }

    private Fraction simplified() {
        int intGcd = computeGcd(numerator, denominator);
        return new Fraction(numerator / intGcd, denominator / intGcd);
    }

    private static int computeGcd(int numerator, int denominator) {
        BigInteger b1 = BigInteger.valueOf(numerator);
        BigInteger b2 = BigInteger.valueOf(denominator);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }


    public Fraction plus(Fraction fraction) {
        return create((this.numerator * fraction.denominator) + (this.denominator * fraction.numerator),
                this.denominator * fraction.denominator);
    }

    public Fraction minus(Fraction fraction) {
        return this.plus(create(-fraction.numerator, fraction.denominator));
    }
}
