package fr.lacombe.fraction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    @Test
    void integers() {
        assertEquals(Fraction.create(5,2),Fraction.create(5).divide(Fraction.create(2)));
    }
}
