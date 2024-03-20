package n1ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MonthListTest {

    @Test
    @DisplayName("Debería tener 12 posiciones")
    void yearSize(){

        Assertions.assertEquals(12, MonthList.getLista().size());

    }

    @Test
    @DisplayName("Debería no ser nula")
    void yearNotNull(){

        Assertions.assertNotNull(MonthList.getLista());

    }

    @Test
    void posiicion8(){

        Assertions.assertEquals("Agosto", MonthList.getLista().get(7));

    }
}
