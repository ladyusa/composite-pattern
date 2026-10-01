package chemistry;

public class Main {
    public static void main(String[] args) {
        Element hydrogen = new Element("H", 10);
        Element oxygen = new Element("O", 5);
        Compound h2o = new Compound();

        h2o.addSubstance(hydrogen);
        h2o.addSubstance(hydrogen);
        h2o.addSubstance(oxygen);

        System.out.println("h2o name: " + h2o.getName());
        System.out.println("h2o weight: " + h2o.getWeight());
    }
}
