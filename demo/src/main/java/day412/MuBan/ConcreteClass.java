package day412.MuBan;

public class ConcreteClass extends AbstractClass{
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2实现被调用...");
    }
}
