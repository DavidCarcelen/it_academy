package n1ejercicio1;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class MonthList {
    public static List<String> year = new ArrayList<>(List.of("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"));

    public static List <String> getLista(){

        return year;
    }

}
