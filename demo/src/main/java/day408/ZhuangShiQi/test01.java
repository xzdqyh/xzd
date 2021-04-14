package day408.ZhuangShiQi;

public class test01 {
    public static void main(String[] args) {
        Shape shape=new Circle();
        ShapeDecorator shapeDecorator=new RedShapeDecorator(new Circle());
        ShapeDecorator shapeDecorator1=new RedShapeDecorator(new Rectangle());
        System.out.println("不添加装饰");
        shape.draw();
        System.out.println("--------");
        shapeDecorator.draw();
        System.out.println("--------");
        shapeDecorator1.draw();
    }
}
