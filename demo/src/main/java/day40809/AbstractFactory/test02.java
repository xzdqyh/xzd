package day40809.AbstractFactory;

public class test02 {
    public static void main(String[] args) {
        farmTwo farm2=new farmTwo();
        farm2.newAnimal().getAnimal();
        farm2.newPlant().getPlant();
    }
}
