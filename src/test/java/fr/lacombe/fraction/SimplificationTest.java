package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimplificationTest {
    @Test
    void simplification() {
        Fraction fraction = Fraction.createSimplified(32, 36);

        Assertions.assertEquals(8, fraction.getNumerator());
        Assertions.assertEquals(9, fraction.getDenominator());
    }
}
