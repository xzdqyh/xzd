package day412.ZuHe;
//树叶构件
public class Leaf implements Component {
    private String name;

    //有参构造
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }

    @Override
    public Component getChild(int i) {
        return null;
    }
}
