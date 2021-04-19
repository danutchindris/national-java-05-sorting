package ro.siit.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureUtil {

    public static double convertCelsiusToFahrenheit(final double celsius) {
        return BigDecimal.valueOf(celsius * 9 / 5 + 32)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
