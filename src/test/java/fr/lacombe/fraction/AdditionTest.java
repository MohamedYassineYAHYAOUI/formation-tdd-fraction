package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest {
    @ParameterizedTest
    @CsvSource({"3,5,8", "3,1,4", "3,2,5", "0,0,0", "0,3,3", "5,0,5",
            "-2,1,-1", "-4,-1,-5",  "3,-1,2", "0,-2,-2"})
    void integers(int fist, int second, int expectedResult) {
        Fraction firstFraction = Fraction.create(fist);
        Fraction secondFraction = Fraction.create(second);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expectedResult, resultFraction.getNumerator());
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
    @CsvSource({"3,4,8,9,8", "1,2,3,5,6"})
    void given_different_fractions_with_same_numerator_de_should_return_sum_of_both_fraction(int numerator, int denominator1,
                                                                                             int denominator2, int expectedNumerator,
                                                                                             int expectedDenominator) {
        Fraction firstFraction = Fraction.create(numerator, denominator1);
        Fraction secondFraction = Fraction.create(numerator,denominator2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expectedNumerator, resultFraction.getNumerator());
        Assertions.assertEquals(expectedDenominator, resultFraction.getDenominator());
    }

    @ParameterizedTest
    @CsvSource({"2,2,1,1", "32,36,8,9"})
    void result_simplification_test(int numerator, int denominator, int expectedNumerator,  int expectedDenominator){
        Fraction fraction = Fraction.create(numerator,denominator );

        Assertions.assertEquals(expectedNumerator, fraction.getNumerator());
        Assertions.assertEquals(expectedDenominator, fraction.getDenominator());
    }

}
