package day40809.ZhuangShiQi;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void set(Shape decoratedShape){
        System.out.println("Border Color：红色");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        set(decoratedShape);
    }


}
