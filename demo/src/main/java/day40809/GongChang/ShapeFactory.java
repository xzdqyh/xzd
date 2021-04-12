package day40809.GongChang;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        //equalsIgnoreCase用于将字符串与指定的对象比较，不考虑大小写
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        return null;
    }

}
