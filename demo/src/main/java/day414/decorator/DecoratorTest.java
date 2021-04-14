package day414.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Shape shape=new CircleShapeImpl();
        AbstractShapeDecorator shapeDecorator=new RedAbstractShapeDecorator(new CircleShapeImpl());
        AbstractShapeDecorator shapeDecorator1=new RedAbstractShapeDecorator(new RectangleShapeImpl());
        System.out.println("不添加装饰");
        shape.draw();
        System.out.println("添加装饰");
        shapeDecorator.draw();
        System.out.println("添加装饰");
        shapeDecorator1.draw();
    }
}
