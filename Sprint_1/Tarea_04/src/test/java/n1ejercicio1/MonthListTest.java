package n1ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MonthListTest {

    private List<String> yearList;

    @BeforeEach
    void setUp() {
        yearList = MonthList.getLista();
    }

    @Test
    @DisplayName("Debería tener 12 posiciones")
    void yearSize(){

        Assertions.assertEquals(12, yearList.size());

    }

    @Test
    @DisplayName("Debería no ser nula")
    void yearNotNull(){

        Assertions.assertNotNull(yearList);

    }

    @Test
    @DisplayName("Octava posicion Agosto")
    void posiicion8(){

        Assertions.assertEquals("Agosto", yearList.get(7));

    }
}
