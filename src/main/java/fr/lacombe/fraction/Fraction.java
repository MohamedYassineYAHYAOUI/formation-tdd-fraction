package fr.lacombe.fraction;

public class Fraction {
    private final int value;

    public Fraction(int value) {
        this.value = value;
    }

    public Fraction plus(Fraction fraction) {
        return new Fraction(this.value + fraction.getValue());

    }

    public int getValue() {
        return value;
    }
}
