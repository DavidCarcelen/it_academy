package n1ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Scanner;

public class CalculoDniTest {
    @ParameterizedTest
    @CsvSource(value = {"47916868,'W'","36927121,'T'","36784509,'B'","80827224,'A'","50208756,'D'","91519812,'Y'","91752611,'E'","31607280,'J'","69732764,'F'","60849774,'P'"})
    @DisplayName("calcula letra dni")

    void calcularLetraTest(int input, char expected){
        int actualValue = input;
        Assertions.assertEquals(expected, CalculoDni.calcularLetra(actualValue));
}
}
