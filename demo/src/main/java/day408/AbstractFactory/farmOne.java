package day408.AbstractFactory;

class farmOne implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("小牛出生");
        return new Cow();
    }

    @Override
    public Plant newPlant() {
        System.out.println("种植菊花");
        return new Chrysanthemum();
    }
}
