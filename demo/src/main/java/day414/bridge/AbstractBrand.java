package day414.bridge;

public abstract class AbstractBrand {
    protected Color color;

    public AbstractBrand(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
