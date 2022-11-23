package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest {
    @ParameterizedTest
    @CsvSource({"3,5,8", "3,1,4", "3,2,5", "0,0,0", "0,3,3", "5,0,5",
            "-2,1,-1", "-4,-1,-5",  "3,-1,2", "0,-2,-2"})
    void given_two_integers_should_return_sum_of_both(int input1, int input2, int expected) {
        Fraction firstFraction = Fraction.FractionFactory(input1);
        Fraction secondFraction = Fraction.FractionFactory(input2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expected, resultFraction.getNumerator());
    }

    @ParameterizedTest
    @CsvSource({"1,2,6,7", "1,2,4,5","1,2,2,3","1,3,1,2","2,3,5,7","2,5,6,8"})
    void given_two_fractions_with_same_denominator_should_return_a_fraction_with_same_denominator(int numerator1, int denominator,
                                                                                                  int numerator2, int expectedNumerator){
        Fraction firstFraction = Fraction.FractionFactory(numerator1, denominator);
        Fraction secondFraction = Fraction.FractionFactory(numerator2,denominator);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expectedNumerator, resultFraction.getNumerator());
        Assertions.assertEquals(denominator, resultFraction.getDenominator());
    }

    @Test
    void given_different_fractions_should_return_sum_of_both_fractions() {
        Fraction firstFraction = Fraction.FractionFactory(1, 2);
        Fraction secondFraction = Fraction.FractionFactory(1,3);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(5, resultFraction.getNumerator());
        Assertions.assertEquals(6, resultFraction.getDenominator());
    }

    @Test
    void given_different_fractions_should_return_sum_of_both_fraction() {
        Fraction firstFraction = Fraction.FractionFactory(3, 2);
        Fraction secondFraction = Fraction.FractionFactory(2,3);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(13, resultFraction.getNumerator());
        Assertions.assertEquals(6, resultFraction.getDenominator());
    }

    @ParameterizedTest
    @CsvSource({"3,4,8,36,32", "1,2,3,5,6"})
    void given_different_fractions_with_same_numerator_de_should_return_sum_of_both_fraction(int numerator, int denominator1,
                                                                                             int denominator2, int expectedNumerator,
                                                                                             int expectedDenominator) {
        Fraction firstFraction = Fraction.FractionFactory(numerator, denominator1);
        Fraction secondFraction = Fraction.FractionFactory(numerator,denominator2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expectedNumerator, resultFraction.getNumerator());
        Assertions.assertEquals(expectedDenominator, resultFraction.getDenominator());
    }

}
