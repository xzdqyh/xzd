package day414.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Color color=new YellowColorImpl();
        AbstractBrand brand=new JordanAbstractBrand(color);
        System.out.println(brand.getName());

        System.out.println(new VanceAbstractBrand(new RedColorImpl()).getName());
    }
}
