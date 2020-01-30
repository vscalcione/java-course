package it.intersistemi.corsojava.entrypoints;

public class ArrayManager {
    public static void main(String[] args) {

    }

    public static String[] stringArray = new String[10];
    public static int lengthArray = stringArray.length;
    public static int index = 0;

    public static boolean loadingSingleElementArray (int index, String element){
        if(element == null || index >= stringArray.length){
            return false;
        }else{
            stringArray[index] = element;
            return true;
        }
    }

    public static void printStringArray(){
        for(String element : stringArray) {
            System.out.println(element);
        }
    }

    public static String searchArrayElement (String element) {
        String result = "";
        if(element == null) {
            result = "Attention string to search invalid !";
        }else{
            int indexBackup = 0;
            for(int index = 0; index < stringArray.length; index++) {
                indexBackup = index;
                if(element.equals(stringArray[index])) {
                    break;
                }
            }
            System.out.println("********************************************");
            if(indexBackup != stringArray.length) {
                result = "Item found in position : " + indexBackup ;
            }else {
                result = "Error!!! Element not found";
            }
        }
        return result;
    }
}
