package examen.exceptions;

public class OrderNotFoundException extends NullPointerException{
    public OrderNotFoundException(String msg){
        super(msg);
    }
}
