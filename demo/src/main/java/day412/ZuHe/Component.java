package day412.ZuHe;
//抽象构件
public interface Component {
    public void add(Component c);

    public void remove(Component c);

    public void operation();

    public Component getChild(int i);
}
