//package it.intersistemi.corsojava.iomanager;
//
//import it.intersistemi.corsojava.consoleinput.ConsoleInputString;
//
//import java.io.*;
//
//public class FileReader_1 {
//
//    public static void createAndWriteFile(){
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        String pathFile = "/path/to/file/file.txt";
//        try{
//            File txtFile = new File(pathFile);
//            FileWriter fileWriter = new FileWriter(txtFile);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for(int index = 0; index < 3; index++){
//                String value = ConsoleInputString.readString(console, "Insert value: ");
//                bufferedWriter.write(value + " ");
//                bufferedWriter.flush();
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void readFile(){
//        String pathFile = "/path/to/file/file.txt";
//        char[] input = new char[50];
//        int sizeFile = 0;
//        try{
//            File txtFile = new File(pathFile);
//            FileReader fileReader = new FileReader(txtFile);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            sizeFile = bufferedReader.read(input);
//            System.out.println("Caratteri presenti nel file: " + sizeFile);
//            System.out.println("Il contenuto del file e': " );
//            for(int index = 0; index < sizeFile; index++){
//                System.out.println(input[index] + "");
//            }
//            bufferedReader.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        createAndWriteFile();
//        readFile();
//    }
//}
