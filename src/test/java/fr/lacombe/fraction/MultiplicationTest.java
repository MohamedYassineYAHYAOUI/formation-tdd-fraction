package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    void integers() {
        Assertions.assertEquals(Fraction.create(14), Fraction.create(2).multiply(Fraction.create(7)));
    }

    @Test
    void negative() {
        var expectedFraction = Fraction.create(-1, 25);
        Assertions.assertEquals(expectedFraction, Fraction.create(-1, 5).multiply(Fraction.create(1, 5)));
    }

    @Test
    void twoNegative() {
        Assertions.assertEquals(Fraction.create(3, 4), Fraction.create(-5, 10).multiply(Fraction.create(3, -2)));
    }

}
