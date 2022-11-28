package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    void integers() {
        Fraction firstFraction = Fraction.create(-4);
        Fraction secondFraction = Fraction.create(1);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(-3, resultFraction.getNumerator());
    }

    @Test
    void sameDenominator() {
        Fraction firstFraction = Fraction.simplified(1, 2);
        Fraction secondFraction = Fraction.simplified(6, 2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(7, resultFraction.getNumerator());
        Assertions.assertEquals(2, resultFraction.getDenominator());
    }

    @Test
    void differentDenominator() {
        Fraction firstFraction = Fraction.simplified(3, 2);
        Fraction secondFraction = Fraction.simplified(2, 3);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(13, resultFraction.getNumerator());
        Assertions.assertEquals(6, resultFraction.getDenominator());
    }


}
