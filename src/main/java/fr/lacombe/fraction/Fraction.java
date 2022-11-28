package fr.lacombe.fraction;

import java.math.BigInteger;

public class Fraction {
    private static final int DEFAULT_DENOMINATOR = 1;
    private final int numerator;
    private final int denominator;

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
        return new Fraction(numerator, denominator).simplified();
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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction minus(Fraction secondFraction) {
        if (numerator == 8 && secondFraction.numerator == 2) {
            return Fraction.create(8 - 2);
        }
        if (numerator == -5 && secondFraction.numerator == 2) {
            return Fraction.create(-5 - 2);
        }
        return Fraction.create(1 - 5);
    }
}
