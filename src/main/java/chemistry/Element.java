package chemistry;

public class Element extends Substance {
    private String name;
    private int weight;

    public Element(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
