package it.intersistemi.corsojava.exceptions.exercises;

public abstract class Fruit {
    private int weight;

    public Fruit(int weight) {
        super();
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
