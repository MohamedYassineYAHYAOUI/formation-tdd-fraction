package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsTest {

    @Test
    void sameFraction() {
        Fraction fraction = Fraction.create(1, 2);
        Fraction fractionToCompare = Fraction.create(1, 2);

        Assertions.assertEquals(fraction, fractionToCompare);
    }

    @Test
    void simplifiedFraction() {
        Fraction fraction = Fraction.create(1, 3);
        Fraction fractionToCompare = Fraction.create(2, 6);

        Assertions.assertEquals(fraction, fractionToCompare);
    }

    @Test
    void differentFraction() {
        Fraction fraction = Fraction.create(2, 5);
        Fraction fractionToCompare = Fraction.create(5, 2);

        Assertions.assertNotEquals(fraction, fractionToCompare);
    }

    @Test
    void inverseFraction() {
        Fraction fraction = Fraction.create(8, -15);
        Fraction fractionToCompare = Fraction.create(-8, 15);
        
        Assertions.assertEquals(fraction, fractionToCompare);
    }
}
