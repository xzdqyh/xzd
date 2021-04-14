package day408.QiaoJie.CeShi;

public abstract class Shape {
    Colors colors;
    public void setColor(Colors color){
        this.colors=color;
    }

    public abstract void draw();
}
