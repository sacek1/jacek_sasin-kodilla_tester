import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MyParametrizedTest {

    @Test
    public void nonParameters() {
//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.add(1, 2);
//        then
        Assertions.assertEquals(3, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void valueParameters(int parameter) {
//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.square(parameter);
//        then
        Assertions.assertEquals(parameter * parameter, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 1", "1, 1", "2,4"})
    public void csvSourceParameters(int input, int expected) {
//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.square(input);
//        then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 1, 1", "1, 1, 2", "2,4, 6"})
    public void csvSourceParameters2(int input1, int input2, int expected) {
//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.add(input1, input2);
//        then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data/testData.csv", numLinesToSkip = 1)
    public void csvSourceParameters3(int input1, int input2, int expected) {
//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.add(input1, input2);
//        then
        Assertions.assertEquals(expected, result);
    }
}
