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
        if (value == 5 || value == 3 || value == 4) {
            return value;
        }

        return value;
    }
}
