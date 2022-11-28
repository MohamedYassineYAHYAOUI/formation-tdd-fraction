package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest {
    @Test
    void integers() {
        Fraction firstFraction = Fraction.create(-4);
        Fraction secondFraction = Fraction.create(1);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(-3, resultFraction.getNumerator());
    }

    @Test
    void sameDenominator(){
        Fraction firstFraction = Fraction.create(1, 2);
        Fraction secondFraction = Fraction.create(6,2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(7, resultFraction.getNumerator());
        Assertions.assertEquals(2, resultFraction.getDenominator());
    }

    @Test
    void differentDenominator() {
        Fraction firstFraction = Fraction.create(3, 2);
        Fraction secondFraction = Fraction.create(2,3);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(13, resultFraction.getNumerator());
        Assertions.assertEquals(6, resultFraction.getDenominator());
    }


    @ParameterizedTest
    @CsvSource({"2,2,1,1", "32,36,8,9"})
    void result_simplification_test(int numerator, int denominator, int expectedNumerator,  int expectedDenominator){
        Fraction fraction = Fraction.create(numerator,denominator );

        Assertions.assertEquals(expectedNumerator, fraction.getNumerator());
        Assertions.assertEquals(expectedDenominator, fraction.getDenominator());
    }

}
