package day412.ZuHe;

import java.util.ArrayList;

public class Composite implements Component{
    private ArrayList<Component> children=new ArrayList<Component>();
    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void operation() {
        for(Component obj:children){
            obj.operation();
        }
    }

    @Override
    public Component getChild(int i) {
        return null;
    }
}
