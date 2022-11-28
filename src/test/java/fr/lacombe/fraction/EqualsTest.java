package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsTest {

    @Test
    void sameFraction() {
        Assertions.assertEquals(Fraction.create(1, 2), Fraction.create(1, 2));
    }

    @Test
    void simplifiedFraction() {
        Assertions.assertEquals(Fraction.create(1, 3), Fraction.create(2, 6));
    }

    @Test
    void differentFraction() {
        Assertions.assertNotEquals(Fraction.create(2, 5), Fraction.create(5, 2));
    }


}
