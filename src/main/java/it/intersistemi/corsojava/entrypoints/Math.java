package it.intersistemi.corsojava.entrypoints;

public class Math {

    public static float sum(float firstValue, float secondValue){
        return firstValue + secondValue;
    }
    public static float difference(float firstValue, float secondValue){
        if(firstValue > secondValue){
            return firstValue - secondValue;
        }else{
            return secondValue - firstValue;
        }
    }

    public static float product(float firstValue, float secondValue){
        return firstValue * secondValue;
    }

    public static float quozient(float firstValue, float secondValue){
        float result = 0;
        if(firstValue != 0 && secondValue != 0){
            if(firstValue > secondValue){
                result = firstValue / secondValue;
            }
        }
        return result;
    }

}
