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
        Fraction firstFraction = new Fraction(input1);
        Fraction secondFraction = new Fraction(input2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(expected, resultFraction.getValue());
    }

    @Test
    void given_two_fractions_with_same_denominator_should_return_a_fraction_with_same_denominator(){
        Fraction firstFraction = new Fraction(1,2);
        Fraction secondFraction = new Fraction(4,2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(5, resultFraction.getNumerator());
        Assertions.assertEquals(2, resultFraction.getDenominator());
    }

    @Test
    void given_two_fractions_with_same_denominator_should_return_a_fraction_with_same_denominator1(){
        Fraction firstFraction = new Fraction(1,2);
        Fraction secondFraction = new Fraction(6,2);

        Fraction resultFraction = firstFraction.plus(secondFraction);

        Assertions.assertEquals(7, resultFraction.getNumerator());
        Assertions.assertEquals(2, resultFraction.getDenominator());
    }

}
