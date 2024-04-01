package n1ejercicio1;

import java.util.ArrayList;

public class NoGenericMethods {
    //private ArrayList <Object> objects = new ArrayList<Object>();
    Object obj1;
    Object obj2;
    Object obj3;

    public NoGenericMethods(Object obj1, Object obj2, Object obj3){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;

    }
    public Object getObj1() {
        return obj1;
    }

    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    public Object getObj2() {
        return obj2;
    }

    public void setObj2(Object obj2) {
        this.obj2 = obj2;
    }

    public Object getObj3() {
        return obj3;
    }

    public void setObj3(Object obj3) {
        this.obj3 = obj3;
    }

}
