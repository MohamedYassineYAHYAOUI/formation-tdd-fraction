package fr.lacombe.fraction;

public class Fraction {
    private final int value;

    public Fraction(int value) {
        this.value = value;
    }

    public Fraction plus(Fraction fraction) {
        if (this.value != 3) {
            if (this.value == 0)
                return new Fraction(this.value + fraction.getValue());
            else
                return new Fraction(this.value + fraction.getValue());
        } else {
            return new Fraction(this.value + fraction.getValue());
        }

    }

    public int getValue() {
        return value;
    }
}
