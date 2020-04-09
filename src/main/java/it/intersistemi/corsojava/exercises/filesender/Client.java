package it.intersistemi.corsojava.exercises.filesender;

import java.io.*;
import java.net.Socket;

public class Client {

    public Client(String ipAddress) throws IOException {
        receiveFile(ipAddress);
    }

    private void receiveFile(String ipAddress) throws IOException {
        int port = 9999;
        Socket s = new Socket(ipAddress, port);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String fileName = dis.readLine();
        s.close();
        File inputFile = new File(fileName);
        Socket conn = new Socket(ipAddress, port);
        InputStream is = conn.getInputStream();
        FileOutputStream fos = new FileOutputStream(inputFile);
        int tmp  = 0;
        while((tmp = is.read()) != -1){
            fos.write(tmp);
        }

    }
}
