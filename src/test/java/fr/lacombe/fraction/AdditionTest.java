package fr.lacombe.fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest {


    @ParameterizedTest
    @CsvSource({"5,5", "3,3", "4,4"})
    void given_integer_plus_zero_should_return_integer(int input, int expected){
        Fraction givenFraction = new Fraction(input);
        Fraction zero = new Fraction(0);

        Fraction resultFraction = givenFraction.plus(zero);

        Assertions.assertEquals(expected,  resultFraction.getValue());
    }

    @ParameterizedTest
    @CsvSource({"3,3", "2,2", "1,1"})
    void given_zero_and_integer_should_return_integer(int input, int expected){
        Fraction zero = new Fraction(0);
        Fraction givenFraction= new Fraction(input);

        Fraction resultFraction = zero.plus(givenFraction);

        Assertions.assertEquals(expected, resultFraction.getValue());
    }

    @ParameterizedTest
    @CsvSource({"3,5,8", "3,1,4", "3,2,5", "0,0,0","0,3,3", "0,2,2", "0,1,1" })
    void given_two_integers_should_return_sum_of_both(int input1, int input2, int expected){
        Fraction givenFirstFraction = new Fraction(input1);
        Fraction givenSecondFraction= new Fraction(input2);

        Fraction resultFraction = givenFirstFraction.plus(givenSecondFraction);

        Assertions.assertEquals(expected, resultFraction.getValue());
    }


}
