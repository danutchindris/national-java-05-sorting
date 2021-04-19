package ro.siit.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class TemperatureUtilTest {

    @ParameterizedTest
    @ValueSource(doubles = {0, 10, 30, -30, 25.5})
    void testConvertCelsiusToFahrenheit(final double testValue) {
        Assertions.assertEquals(testValue * 9 / 5 + 32,
                TemperatureUtil.convertCelsiusToFahrenheit(testValue));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-values.csv", numLinesToSkip = 1)
    void testConvertCelsiusToFahrenheitWithValuesFromCsvFile(final double input, final double expected) {
        Assertions.assertEquals(expected,
                TemperatureUtil.convertCelsiusToFahrenheit(input));
    }
}
