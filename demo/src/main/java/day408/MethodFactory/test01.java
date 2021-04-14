package day408.MethodFactory;

public class test01 {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1=new ConcreteFactory1();
        concreteFactory1.newProduct().show();

        ConcreteFactory2 concreteFactory2=new ConcreteFactory2();
        concreteFactory2.newProduct().show();
    }
}
