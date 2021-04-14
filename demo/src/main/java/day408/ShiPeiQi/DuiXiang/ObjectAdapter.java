package day408.ShiPeiQi.DuiXiang;

import day408.ShiPeiQi.Lei.Adaptee;
import day408.ShiPeiQi.Lei.Target;

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
