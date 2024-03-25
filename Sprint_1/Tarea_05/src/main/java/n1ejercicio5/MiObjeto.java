package n1ejercicio5;

import java.io.Serializable;

public class MiObjeto implements Serializable {
    private String atr1;

    private int atr2;

    public MiObjeto(String atr1, int atr2){
        this.atr1 = atr1;
        this.atr2 = atr2;
    }

    public String getAtr1() {
        return atr1;
    }
    public int getAtr2() {
        return atr2;
    }

    public void setAtr1(String atr1) {
        this.atr1 = atr1;
    }

    public void setAtr2(int atr2) {
        this.atr2 = atr2;
    }
}
