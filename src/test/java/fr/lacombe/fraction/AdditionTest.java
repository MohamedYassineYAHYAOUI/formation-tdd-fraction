package fr.lacombe.fraction;

import org.junit.jupiter.api.Assertions;
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


}
