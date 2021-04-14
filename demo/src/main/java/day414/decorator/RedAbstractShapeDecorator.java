package day414.decorator;

public class RedAbstractShapeDecorator extends AbstractShapeDecorator {
    public RedAbstractShapeDecorator(Shape decoratedShape) {
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
