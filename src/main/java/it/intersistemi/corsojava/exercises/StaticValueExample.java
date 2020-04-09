package it.intersistemi.corsojava.exercises;

public class StaticValueExample {

    static int hexadecimalValue;
    static {
        StaticValueExample.hexadecimalValue = 19845;
    }

    public static void main(String[] args) {
        final String[] array = { "aaaaaaaaaaaa", "bbbbbbbbbbbb", "ccccccccccc", "ddddddddddddddd", "yyyyyyy", "zzzzzz", "xxxxx" };
        System.out.println("Hello World! ");
        System.out.println("Valore esasdecimale = " + StaticValueExample.hexadecimalValue);
        for(int index = 0; index < array.length; index++){
            System.out.println(array[index]);
        }
    }
}
