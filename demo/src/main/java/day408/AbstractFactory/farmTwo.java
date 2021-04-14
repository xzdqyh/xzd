package day408.AbstractFactory;

public class farmTwo implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("小马出生");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("种植玫瑰");
        return new Rose();
    }
}
