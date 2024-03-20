package n1ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CalculoDniTest {
    @Test
    @DisplayName("calcula letra dni")
    void calcularLetraTest(){
        int dniNumber = 47916868;
        Assertions.assertEquals('W', CalculoDni.calcularLetra(dniNumber));
}
}
