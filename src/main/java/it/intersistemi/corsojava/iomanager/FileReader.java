package it.intersistemi.corsojava.iomanager;

import java.io.*;

public class FileReader {

    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public static void testFileReader(){
        String fileName = "/path/file/to/test";
        try(InputStream is = new FileInputStream(fileName);
        ) {
            int readByte = 0;
            int read;
            do{
                read = is.read();
                if(read != -1){
                    readByte++;
                }
                System.out.println(read);
            }
            while(read != -1);
            System.out.println("Read" + readByte + " bytes ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new InputStreamReader(new FileInputStream("fileName"));
        FileReader fileReader = new FileReader("fileName");
        testFileReader();
    }
}
