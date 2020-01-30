package it.intersistemi.corsojava.entrypoints;

public class Calculations {
    public static byte byteVar = 20;
    public static short shortVar = 5;
    public static int intVar = 3;
    public static long longVar = 45L;
    public static float floatVar = 25F;
    public static char charVar = 'f';
    public static boolean boolVar = true;
    public static double doubleVar = 26.4;

    public static void main(String[] args) {
        System.out.println("Byte variable result: " + getDoubleByte());
        System.out.println("Short variable result: " + getDoubleShort());
        System.out.println("Int variable result: " + getDoubleInt());
        System.out.println("Long variable result: " + getDoubleLong());
        System.out.println("Float variable result: " + getDoubleFloat());
        System.out.println("Double variable result: " + getDoubleDouble());
        System.out.println("Char variable result: " + getDoubleChar());
        System.out.println("Boolean variable result: " + getDoubleBoolean());
    }

    public static byte getDoubleByte() {
        byte result = (byte) (byteVar * 2);
        return result;
    }

    public static short getDoubleShort() {
        short result = (short) (shortVar * 2);
        return result;
    }

    public static int getDoubleInt() {
        return intVar * 2;
    }

    public static long getDoubleLong() {
        return longVar * 2;
    }

    public static float getDoubleFloat() {
        return floatVar * 2;
    }

    public static double getDoubleDouble() {
        return doubleVar * 2;
    }

    public static char getDoubleChar() {
        int var = (int) charVar;
        var = var * 2;
        return (char) var;
    }

    public static boolean getDoubleBoolean() {
        return boolVar;
    }
}
