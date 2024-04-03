package n2ejercicio1;

public class GenericMethods {
    public GenericMethods(){

    }
    public <T> void genericMethod(String str, T arg2, T arg3){
        System.out.println( "Argumento1: " + str + "\nArgumento2: " +  arg2.toString() + "\nArgumento3: " +  arg3.toString());
    }
}
