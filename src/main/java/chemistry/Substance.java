package chemistry;

public abstract class Substance {
    protected Compound parent;

    public abstract int getWeight();
    public abstract String getName();

    public Compound getParent() {
        return parent;
    }

    public void setParent(Compound parent) {
        this.parent = parent;
    }
}
