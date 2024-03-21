package n1ejercicio3;

public class OutOfBounds {
    public static void main(String[] args) {

        int num = provocarError();
        System.out.println(num);

    }

    public static int provocarError(){
        int[]lista = {1,2,3};
        int num = lista[3];

        return num;
    }

}
