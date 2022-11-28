package fr.lacombe.fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    void integers() {
        Fraction firstFraction = Fraction.create(2);
        Fraction secondFraction = Fraction.create(7);

        assertEquals(Fraction.create(14), firstFraction.multiply(secondFraction));
    }

    @Test
    void negative() {
        Fraction firstFraction = Fraction.create(-1, 5);
        Fraction secondFraction = Fraction.create(1, 5);
        var expectedFraction = Fraction.create(-1, 25);

        assertEquals(expectedFraction, firstFraction.multiply(secondFraction));
    }

    @Test
    void twoNegative() {
        var expectedFraction = Fraction.create(3, 4);
        Fraction secondFraction = Fraction.create(3, -2);
        Fraction firstFraction = Fraction.create(-5, 10);

        assertEquals(expectedFraction, firstFraction.multiply(secondFraction));
    }

}
