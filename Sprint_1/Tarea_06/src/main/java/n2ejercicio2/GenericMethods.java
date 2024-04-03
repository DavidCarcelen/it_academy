package n2ejercicio2;

import java.util.List;

public class GenericMethods {
    public GenericMethods(){

    }
    public <T> void genericMethod(List<T>lista){
        for(T t: lista){
            System.out.println(t.toString());
        }
    }
}
