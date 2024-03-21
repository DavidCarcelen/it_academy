package n1ejercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutOfBoundsTest {

    @Test
    void outOfBounds(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() -> OutOfBounds.provocarError());
    }
}
