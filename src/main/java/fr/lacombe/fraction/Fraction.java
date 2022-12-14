package fr.lacombe.fraction;

import java.math.BigInteger;
import java.util.Objects;

public class Fraction {
    private static final int DEFAULT_DENOMINATOR = 1;
    private final int numerator;
    private final int denominator;

    private Fraction inverse() {
        return Fraction.create(denominator, numerator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object fraction) {
        if (this == fraction) return true;
        if (fraction == null || getClass() != fraction.getClass()) return false;
        Fraction castedFraction = (Fraction) fraction;
        return numerator == castedFraction.numerator && denominator == castedFraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
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
        return denominator < 0 ? fraction.negate() : fraction;
    }

    private Fraction negate() {
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
        return this.plus(fraction.opposite());
    }

    private Fraction opposite() {
        return create(-numerator, denominator);
    }

    public Fraction multiply(Fraction fraction) {
        return Fraction.create(numerator * fraction.numerator, denominator * fraction.denominator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        }
        return numerator + "/" + denominator;
    }

    public Fraction divide(Fraction fraction) {
        return this.multiply(fraction.inverse());
    }

}
