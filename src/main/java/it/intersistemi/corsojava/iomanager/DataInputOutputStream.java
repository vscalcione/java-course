package it.intersistemi.corsojava.iomanager;

import java.io.*;
import java.io.DataInputStream;

public class DataInputOutputStream {

    public static void dataInputStream(){

        String currentWorkingDirectory = System.getProperty("user.dir");
        System.out.println("Current Working Directory: " + currentWorkingDirectory);
        try(FileInputStream fileInputStream = new FileInputStream("prova.dat");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        ){

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dataOutputStream(){
        try(FileOutputStream fileOutputStream = new FileOutputStream("prova.dat");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ){
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
            dataOutputStream.writeInt(15);
            dataOutputStream.writeDouble(54.936);
            dataOutputStream.writeUTF("Write test");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        dataInputStream();
        dataOutputStream();
    }
}
