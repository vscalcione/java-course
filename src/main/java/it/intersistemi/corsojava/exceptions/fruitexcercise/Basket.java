package it.intersistemi.corsojava.exceptions.fruitexcercise;

import java.util.ArrayList;

public class Basket <F extends Fruit>{
    private Fruit singleFruit;
    private ArrayList<F> fruit;

    public Basket(ArrayList<F> fruit) {
        this.fruit = new ArrayList<>();
    }

    public Basket() {
    }

    public ArrayList<F> getFruit() {
        return fruit;
    }

    public int getWeight(){
        int weight = 0;
        for(F singleFruit : fruit){
            weight = singleFruit.getWeight();
        }
        return weight;
    }

    public void addFruit(F singleFruit) throws TooHeavyException{
        final int weightNew = getWeight() + singleFruit.getWeight();
        if(weightNew > 5000){
            throw new TooHeavyException("Weight too high. " + weightNew + "grams! ");
        }
        fruit.add(singleFruit);
        System.out.println(singleFruit.getClass().getName() + "to: " + singleFruit.getWeight() + "grams added to basket ");
    }

    @Override
    public String toString() {
        return "Basket [fruit = "+ singleFruit + " ]";
    }

    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<Apple>();
        for(int index = 0; index < 20; index ++){
            try{
              Apple apple = new Apple(50);
              appleBasket.addFruit(apple);
            }catch(TooHeavyException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
