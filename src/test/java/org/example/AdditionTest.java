package org.example;
;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    void given_in_zero_zero_should_return_zero(){
        Fraction fraction1 = new Fraction(0);
        Fraction fraction2 = new Fraction(0);
        Fraction sommeFraction = fraction1.addition(fraction2);

        Assertions.assertEquals(0, sommeFraction.getValue());
    }

}
