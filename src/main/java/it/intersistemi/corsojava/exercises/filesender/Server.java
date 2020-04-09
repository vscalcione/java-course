package it.intersistemi.corsojava.exercises.filesender;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket ss;
    private File myFile;
    private String fileName;

    public void setFile(File file){
        myFile = file;
        fileName = myFile.getName();
    }

    public Server(File file) throws IOException {
        setFile(file);
        ss = new ServerSocket(9999);
        Socket nameSenderSocket = ss.accept();
        PrintStream ps = new PrintStream(nameSenderSocket.getOutputStream());
        ps.println(fileName);
        nameSenderSocket.close();
        FileInputStream fis = new FileInputStream(myFile);
        byte[] binaryFile = new byte[(int)myFile.length()];
        fis.read(binaryFile);
        Socket s = ss.accept();
        OutputStream os = s.getOutputStream();
        os.write(binaryFile);
        fis.close();
        os.close();
        s.close();
    }
}
