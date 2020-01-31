package it.intersistemi.corsojava.entrypoints;

public class EntryPoint1 {
    private static int index;
    public static void main(String[] args) {
        boolean checkLoading = ArrayManager.loadingSingleElementArray(0, "word");
        if(checkLoading) {
            ArrayManager.printStringArray();
            String resultSearch=ArrayManager.searchArrayElement("word");
            System.out.println(resultSearch);
        }
    }
}
