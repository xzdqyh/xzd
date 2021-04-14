package day414.bridge;

public class VanceAbstractBrand extends AbstractBrand{
    public VanceAbstractBrand(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor()+"万斯";
    }
}
