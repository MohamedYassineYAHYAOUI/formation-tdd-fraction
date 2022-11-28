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

}
