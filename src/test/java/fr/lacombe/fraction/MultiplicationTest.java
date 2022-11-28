package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    void integers() {
        Assertions.assertEquals(Fraction.create(14), Fraction.create(2).multiply(Fraction.create(7)));
    }

}
