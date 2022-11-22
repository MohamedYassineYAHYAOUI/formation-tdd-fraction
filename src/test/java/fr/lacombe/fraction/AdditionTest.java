package fr.lacombe.fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest {

    @Test
    void given_in_zero_zero_should_return_zero(){
        Fraction zero = new Fraction(0);

        Fraction resultFraction = zero.add(zero);

        Assertions.assertEquals(0, resultFraction.getValue());
    }


    @ParameterizedTest
    @CsvSource({"5,5", "3,3", "4,4"})
    void given_integer_plus_zero_should_return_integer(int input, int expected){
        Fraction givenFraction = new Fraction(input);
        Fraction zero = new Fraction(0);

        Fraction resultFraction = givenFraction.add(zero);

        Assertions.assertEquals(expected,  resultFraction.getValue());
    }

    @ParameterizedTest
    @CsvSource({"3,3", "2,2", "1,1"})
    void given_in_zero_and_integer_should_return_integer(int input, int expected){
        Fraction zero = new Fraction(0);
        Fraction givenFraction= new Fraction(input);

        Fraction resultFraction = zero.add(givenFraction);

        Assertions.assertEquals(expected, resultFraction.getValue());
    }
}
