package it.intersistemi.corsojava.iomanager;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TelnetClient {

    private static void initServerMessageConsole(InputStream is){
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(is));
        Runnable task = new Runnable() {
            @Override
            public void run() {
                String read;
                try{
                    while((read = socketReader.readLine()) != null){
                        System.out.println(read);
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(task);
        t.start();
    }

    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String hostServer = "localhost";
        int portServer = 7;
        try(Socket socket = new Socket(hostServer, portServer);
            OutputStream socketOutput = socket.getOutputStream();
            InputStream socketInput = socket.getInputStream();
        ){
            initServerMessageConsole(socketInput);
            PrintWriter pw = new PrintWriter(socketOutput, true);
            String line;
            while((line = console.readLine()) != null){
                pw.println(line);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
