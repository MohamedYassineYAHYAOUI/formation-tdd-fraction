package fr.lacombe.fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest {

    @Test
    void given_in_zero_zero_should_return_zero(){
        Fraction fraction1 = new Fraction(0);
        Fraction fraction2 = new Fraction(0);
        Fraction sommeFraction = fraction1.addition(fraction2);

        Assertions.assertEquals(0, sommeFraction.getValue());
    }


    @ParameterizedTest
    @CsvSource({"5,5"})
    void given_integer_plus_zero_should_return_integer(int input, int expected){
        Fraction fraction1 = new Fraction(input);
        Fraction fraction2 = new Fraction(0);
        Fraction sommeFraction = fraction1.addition(fraction2);

        Assertions.assertEquals(expected, sommeFraction.getValue());
    }

}
