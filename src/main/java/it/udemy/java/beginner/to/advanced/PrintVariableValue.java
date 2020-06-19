package it.udemy.java.beginner.to.advanced;

public class PrintVariableValue {

    public static int intValue = 42;
    public static short shortValue = 93;
    public static long longValue = 8304;
    public static double doubleValue = 3.4553;
    public static float floatValue = 5.234f;
    public static char charValue = 'a';
    public static boolean booleanValue = true;

    public static void main(String[] args) {
        System.out.println("Int value is: " + intValue +
                "\nShort value is: " + shortValue +
                "\nLong value is: " + longValue +
                "\nDouble value is: " + doubleValue +
                "\nFloat value is: " + floatValue +
                "\nChar value is: " + charValue +
                "\nBoolean value is: " + booleanValue);
    }

}
