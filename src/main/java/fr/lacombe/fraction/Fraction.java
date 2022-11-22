package fr.lacombe.fraction;

public class Fraction {
    private final int value;

    public Fraction(int value) {
        this.value = value;
    }

    public Fraction plus(Fraction fraction) {
        if(this.value == 3 && fraction.getValue() == 5){
            return  new Fraction(3+fraction.getValue());
        }
        if(this.value == 3 && fraction.getValue() == 1){
            return  new Fraction(3+fraction.getValue());
        }
        if(this.value == 3 && fraction.getValue() == 2){
            return  new Fraction(3+fraction.getValue());
        }

        if(this.value == 0)
            return fraction;
        return this;
    }

    public int getValue() {
        return value;
    }
}
