package it.intersistemi.corsojava.exceptions.examples;

import java.util.Random;

public class DivideMain {
    public static void main(String[] args) {
        Random value = new Random();
        while(true){
            Integer result  = null;
            Integer firstValue = value.nextInt(50);
            Integer secondValue = value.nextInt(10);
            try{
                result = firstValue / secondValue;
            }catch(ArithmeticException exception) {
                System.out.println(firstValue + " / "+" = Error: " + exception.getMessage());
            }
            finally {
                if(result != null) {
                    System.out.println("Result: " + result);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
