package it.intersistemi.corsojava.exceptions.examples;

import java.util.Random;

public class Exceptions {

    public Exceptions() {
    }

    public static void method1(){
        int[] t = null;
        try{
            t[0] = 7;
        }catch(Exception e){
            System.out.println("Variable not allocated in memory ");
            e.printStackTrace();
            t = new int[] {7};
            System.out.print(t[0]);
        }
        finally {
            System.out.println("Anyway, I went through here ");
        }
    }

    public static void method2(){
        int[] intArray = new int[10];
        int index = 0;
        try{
            while(true){
                intArray[index] = index / new Random().nextInt(10);
                index++;
                System.out.println(index);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("With index " + index + " I have reached the edge of the array ");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("With index " + index + " a calculation error has occurred ");
            e.printStackTrace();
        }finally{
            System.out.println("Anyway, I went through here ");
        }
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
