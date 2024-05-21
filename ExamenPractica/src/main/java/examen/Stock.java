package examen;

import java.util.HashSet;
import java.util.Set;

public class Stock {
    private Set<Sala> salas;

    private Set<ObjetoDecoracion> objetos;

    private Set<Pista> pistas;

    public Stock() {
        this.salas = new HashSet<>();
        this.objetos = new HashSet<>();
        this.pistas = new HashSet<>();
    }

    public Set<Sala> getSalas() {
        return salas;
    }
    public Set<ObjetoDecoracion> getObjetos() {
        return objetos;
    }
    public Set<Pista> getPistas() {
        return pistas;
    }

}
