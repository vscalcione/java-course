package it.intersistemi.corsojava.exceptions.examples;

public class ExceptionStackMain {

    public static void main(String[] args) {
        try{
            method1();
        }catch (StackOverflowError exception){
            if(exception.getMessage() == null){
                System.out.println("Content: " + exception.getMessage());
            }
            StackTraceElement[] stackTraceElement = exception.getStackTrace();
            System.out.println(stackTraceElement.length);
        }
    }

    public static void method1(){
        method1();
    }
}
