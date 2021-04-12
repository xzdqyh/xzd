package day40809.ShiPeiQi.DuiXiang;

import day40809.ShiPeiQi.Lei.Adaptee;
import day40809.ShiPeiQi.Lei.Target;

public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
