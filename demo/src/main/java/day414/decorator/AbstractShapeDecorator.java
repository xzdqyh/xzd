package day414.decorator;

public abstract class AbstractShapeDecorator implements Shape {
    protected Shape decoratedShape;

     AbstractShapeDecorator(Shape decoratedShape){
         this.decoratedShape=decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
