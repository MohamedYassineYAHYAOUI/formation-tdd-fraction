package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    void integers() {
        Fraction firstFraction = Fraction.create(2);
        Fraction secondFraction = Fraction.create(7);
        Fraction expected = Fraction.create(14);

        Assertions.assertEquals(expected, firstFraction.multiply(secondFraction));
    }

    @Test
    void negative() {

        Fraction firstFraction = Fraction.create(-1, 5);
        Fraction secondFraction = Fraction.create(1, 5);
        var expectedFraction = Fraction.create(-1, 25);
        
        Assertions.assertEquals(expectedFraction, firstFraction.multiply(secondFraction));
    }

    @Test
    void twoNegative() {
        var expectedFraction = Fraction.create(3, 4);
        Assertions.assertEquals(expectedFraction, Fraction.create(-5, 10).multiply(Fraction.create(3, -2)));
    }

}
