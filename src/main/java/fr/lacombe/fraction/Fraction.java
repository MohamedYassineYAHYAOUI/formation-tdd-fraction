package fr.lacombe.fraction;

public class Fraction {
    private final int value;

    public Fraction(int value) {
        this.value = value;
    }

    public Fraction addition(Fraction fraction) {
        if(this.value == 0)
            return fraction;
        return this;
    }

    public int getValue() {
        return value;
    }
}
