package it.intersistemi.corsojava.iomanager;

import javax.swing.*;
import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws FileNotFoundException {

        File currentWorkingDirectory = new File(System.getProperty("user.dir"));
        JFileChooser jFileChooser = new JFileChooser(currentWorkingDirectory);
        File inputFile = null;
        File outputFile = null;
        int returnValue = jFileChooser.showOpenDialog(null);
        if(returnValue == jFileChooser.APPROVE_OPTION){
            inputFile = jFileChooser.getSelectedFile();
            returnValue = jFileChooser.showOpenDialog(null);
            if(returnValue == jFileChooser.APPROVE_OPTION){
                outputFile = jFileChooser.getSelectedFile();
            }
        }
        System.out.println("Input File: " + inputFile);
        System.out.println("Output File: " + outputFile);

        if(inputFile != null && outputFile != null){
            try(FileInputStream fis = new FileInputStream(inputFile);
                FileOutputStream fos = new FileOutputStream(outputFile);
            ){
                long startMillis = System.currentTimeMillis();
                int copiedBytes = 0;
                byte[] buffer = new byte[1024];
                int read;
                while((read = fis.read(buffer)) != -1){
                    fos.write(buffer, 0, read);
                    copiedBytes += read;
                }
                long endMillis = System.currentTimeMillis();
                System.out.println("Were copied " + copiedBytes + " in: " + (endMillis - startMillis) + " milliseconds ");
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
