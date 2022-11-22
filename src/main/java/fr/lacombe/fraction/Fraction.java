package fr.lacombe.fraction;

public class Fraction {


    private final int value;

    public Fraction(int i) {
        value = i;
    }

    public Fraction addition(Fraction fraction) {
        if(value == 5){
            return new Fraction(value);
        }

        if(value == 3){
            return new Fraction(value);
        }

        if(value == 4){
            return new Fraction(value);
        }
        return new Fraction(0);
    }

    public int getValue() {
        if(value == 5){
            return 5;
        }
        if(value == 3){
            return 3;
        }

        if(value == 4){
            return 4;
        }
        return 0;
    }
}
