package day408.AbstractFactory;

public class test01 {
    public static void main(String[] args) {
        farmOne farm1=new farmOne();
        farm1.newAnimal().getAnimal();
        farm1.newPlant().getPlant();
    }


}
