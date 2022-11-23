package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest {
    @ParameterizedTest
    @CsvSource({"3,5,8", "3,1,4", "3,2,5", "0,0,0", "0,3,3", "0,2,2", "0,1,1", "5,0,5", "3,0,3", "4,0,4"})
    void given_two_integers_should_return_sum_of_both(int input1, int input2, int expected) {
        Fraction givenFirstFraction = new Fraction(input1);
        Fraction givenSecondFraction = new Fraction(input2);

        Fraction resultFraction = givenFirstFraction.plus(givenSecondFraction);

        Assertions.assertEquals(expected, resultFraction.getValue());
    }
}
