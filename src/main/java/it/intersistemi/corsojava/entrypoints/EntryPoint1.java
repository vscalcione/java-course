package it.intersistemi.corsojava.entrypoints;

public class EntryPoint1 {
    private static int index;
    public static void main(String[] args) {
        boolean checkLoading = ArrayManager.loadingSingleElementArray(0, "parola");
        if(checkLoading) {
            ArrayManager.printStringArray();
            String resultSearch=ArrayManager.searchArrayElement("parola");
            System.out.println(resultSearch);
        }
    }
}
