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
        Fraction firstFraction = Fraction.create(input1);
        Fraction secondFraction = Fraction.create(input2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expected, resultFraction.getNumerator());
    }

    @ParameterizedTest
    @CsvSource({"1,2,6,7", "1,2,4,5","1,2,2,3","1,3,1,2","2,3,5,7","2,5,6,8"})
    void given_two_fractions_with_same_denominator_should_return_a_fraction_with_same_denominator(int numerator1, int denominator,
                                                                                                  int numerator2, int expectedNumerator){
        Fraction firstFraction = Fraction.create(numerator1, denominator);
        Fraction secondFraction = Fraction.create(numerator2,denominator);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expectedNumerator, resultFraction.getNumerator());
        Assertions.assertEquals(denominator, resultFraction.getDenominator());
    }

    @Test
    void given_different_fractions_should_return_sum_of_both_fractions() {
        Fraction firstFraction = Fraction.create(1, 2);
        Fraction secondFraction = Fraction.create(1,3);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(5, resultFraction.getNumerator());
        Assertions.assertEquals(6, resultFraction.getDenominator());
    }

    @Test
    void given_different_fractions_should_return_sum_of_both_fraction() {
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

    /* To do all
    Faire un test pour la simplication
    */
    @ParameterizedTest
    @CsvSource({"2,2,1,1", "32,36,8,9"})
    void result_simplification_test(int numerator, int denominator, int expectedNumerator,  int expectedDenominator){
        Fraction fraction = Fraction.create(numerator,denominator );

        Assertions.assertEquals(expectedNumerator, fraction.getNumerator());
        Assertions.assertEquals(expectedDenominator, fraction.getDenominator());
    }

}
