package it.intersistemi.corsojava.exceptions.examples;

public class MyException extends Exception{
    private static final long serialVersionUID = -4330525837054650071L;
    private int value;

    public MyException(int value){
        super();
        this.value = value;
    }

    public MyException(String message, int value) {
        super(message);
        this.value = value;
    }
    public MyException(int value, Throwable cause) {
        super(cause);
        this.value = value;
    }

    public MyException(int value, String message, Throwable cause) {
        super(message, cause);
        this.value = value;
    }
}
