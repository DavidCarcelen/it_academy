package n1ejercicio2;

public class GenericMethods {
    public GenericMethods(){

    }
    public <T> void genericMethod(T arg1, T arg2, T arg3){
        System.out.println( "Argumento1: " + arg1.toString() + "\nArgumento2: " +  arg2.toString() + "\nArgumento3: " +  arg3.toString());
    }
}
