package it.intersistemi.corsojava.iomanager;

import java.io.*;
import java.io.DataInputStream;

public class DataInputOutputStream {

    public static void dataInputStream(){

        String currentWorkingDirectory = System.getProperty("user.dir");
        System.out.println("Current Working Directory: " + currentWorkingDirectory);
        try(FileInputStream fis = new FileInputStream("prova.dat");
            DataInputStream dis = new DataInputStream(fis);
        ){

            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dataOutputStream(){
        try(FileOutputStream fos = new FileOutputStream("prova.dat");
            BufferedOutputStream bis = new BufferedOutputStream(fos);
        ){
            DataOutputStream das = new DataOutputStream(bis);
            das.writeInt(15);
            das.writeDouble(54.936);
            das.writeUTF("Write test");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        dataInputStream();
        dataOutputStream();
    }
}
