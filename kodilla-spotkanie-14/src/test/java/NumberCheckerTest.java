import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 9, 12})
    void isDivisibleByThree(int number) {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean result = numberChecker.isDivisibleByThree(number);
        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,true", "1,false"})
    void isDivisibleByThree(int number, boolean expectedResult) {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean actualResult = numberChecker.isDivisibleByThree(number);
        //then
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1, delimiter = ';')
    void isDivisibleByThreeFromFile(int number, boolean expectedResult) {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean actualResult = numberChecker.isDivisibleByThree(number);
        //then
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource(value = "StringSources#provideStringsForTestingLength")
    void isDivisibleByThreeFromMethod(int number, boolean expectedResult) {
        //given
        NumberChecker numberChecker = new NumberChecker();
        //when
        boolean actualResult = numberChecker.isDivisibleByThree(number);
        //then
        assertEquals(expectedResult, actualResult);
    }


}