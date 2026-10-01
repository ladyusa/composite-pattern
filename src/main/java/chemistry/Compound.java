package chemistry;

import java.util.ArrayList;
import java.util.List;

public class Compound extends Substance {
    private List<Substance> children;

    public Compound() {
        this.children = new ArrayList<>();
    }

    public void addSubstance(Substance substance) {
        children.add(substance);
        substance.setParent(this);
    }

    @Override
    public int getWeight() {
        int total = 0;
        for (Substance child : children)
            total += child.getWeight();
        return total;
    }

    @Override
    public String getName() {
        StringBuffer totalName = new StringBuffer();
        for (Substance child : children)
            totalName.append(child.getName());
        return totalName.toString();
    }
}
