package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubstractionTest {

    @Test
    void integers() {
        Fraction firstFraction = Fraction.create(1);
        Fraction secondFraction = Fraction.create(5);

        Fraction result = firstFraction.minus(secondFraction);

        Assertions.assertEquals(-4, result.getNumerator());
    }

    @Test
    void sameDenominator() {
        Fraction firstFraction = Fraction.create(-1, 3);
        Fraction secondFraction = Fraction.create(1, 3);

        Fraction result = firstFraction.minus(secondFraction);

        Assertions.assertEquals(-2, result.getNumerator());
        Assertions.assertEquals(3, result.getDenominator());
    }

    @Test
    void differentDenominator() {
        Fraction firstFraction = Fraction.create(3, 4);
        Fraction secondFraction = Fraction.create(1, 2);

        Fraction result = firstFraction.minus(secondFraction);

        Assertions.assertEquals(1, result.getNumerator());
        Assertions.assertEquals(4, result.getDenominator());
    }

    @Test
    void negativeDenominator() {
        Fraction fraction = Fraction.create(8, -15);
        Assertions.assertEquals(-8, fraction.getNumerator());
        Assertions.assertEquals(15, fraction.getDenominator());
    }
}
