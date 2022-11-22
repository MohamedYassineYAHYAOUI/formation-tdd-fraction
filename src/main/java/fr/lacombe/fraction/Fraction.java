package fr.lacombe.fraction;

public class Fraction {
    private final int value;

    public Fraction(int value) {
        this.value = value;
    }

    public Fraction addition(Fraction fraction) {
        return this;
    }

    public int getValue() {
        return value;
    }
}
