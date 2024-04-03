package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        int c = 7;

        NoGenericMethods noGenericMethods = new NoGenericMethods(a,b,c);
        NoGenericMethods noGenericMethods1 = new NoGenericMethods(b,c,a);
        NoGenericMethods noGenericMethods2 = new NoGenericMethods(c, a, b);

    }
}
