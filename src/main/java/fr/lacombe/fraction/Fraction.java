package fr.lacombe.fraction;

public class Fraction {


    private final int value;

    public Fraction(int i) {
        value = i;
    }

    public Fraction addition(Fraction fraction) {
        return new Fraction(value);
    }

    public int getValue() {
        return value;
    }
}
