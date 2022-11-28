package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoustractionTest {

    @Test
    void integers() {
        Fraction firstFraction = Fraction.create(1);
        Fraction secondFraction = Fraction.create(5);

        Fraction result = firstFraction.minus(secondFraction);

        Assertions.assertEquals(-4, result.getNumerator());
    }

    @Test
    void integers2() {
        Fraction firstFraction = Fraction.create(8);
        Fraction secondFraction = Fraction.create(2);

        Fraction result = firstFraction.minus(secondFraction);

        Assertions.assertEquals(6, result.getNumerator());
    }

    @Test
    void integers3() {
        Fraction firstFraction = Fraction.create(-5);
        Fraction secondFraction = Fraction.create(2);

        Fraction result = firstFraction.minus(secondFraction);

        Assertions.assertEquals(-7, result.getNumerator());
    }
}
