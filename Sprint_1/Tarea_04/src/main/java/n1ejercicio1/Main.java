package n1ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
        //Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.

         ArrayList<String> year = new ArrayList<String>();


            year.add("January");
            year.add("February");
            year.add("March");
            year.add("April");
            year.add("May");
            year.add("June");
            year.add("July");
            year.add("August");
            year.add("September");
            year.add("October");
            year.add("November");
            year.add("December");


        System.out.println(year);


    }
}
