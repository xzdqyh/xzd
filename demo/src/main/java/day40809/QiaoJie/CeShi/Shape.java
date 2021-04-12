package day40809.QiaoJie.CeShi;

public abstract class Shape {
    Colors colors;
    public void setColor(Colors color){
        this.colors=color;
    }

    public abstract void draw();
}
