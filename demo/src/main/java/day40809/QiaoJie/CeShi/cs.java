package day40809.QiaoJie.CeShi;

public class cs {
    public static void main(String[] args) {
        Colors colors=new White();
        Shape shape=new Square();
        shape.setColor(colors);
        shape.draw();

        Shape shape1=new Rectangle();
        shape1.setColor(colors);
        shape1.draw();
    }
}
