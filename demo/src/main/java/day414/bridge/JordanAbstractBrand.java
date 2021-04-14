package day414.bridge;

public class JordanAbstractBrand extends AbstractBrand{
    public JordanAbstractBrand(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor()+"乔丹";
    }
}
