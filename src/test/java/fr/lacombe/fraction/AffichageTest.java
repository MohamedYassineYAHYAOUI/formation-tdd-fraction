package fr.lacombe.fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AffichageTest {

    @Test
    void integer() {
        assertEquals("1", Fraction.create(1).toString());
    }

    @Test
    void negativeIntegers() {
        assertEquals("-3", Fraction.create(-3).toString());
    }

    @Test
    void denominateurDifferentThanOne() {
        assertEquals("1/2", Fraction.create(1, 2).toString());
    }

    @Test
    void negativeDenominator() {
        assertEquals("-1/2", Fraction.create(1, -2).toString());
    }
}
