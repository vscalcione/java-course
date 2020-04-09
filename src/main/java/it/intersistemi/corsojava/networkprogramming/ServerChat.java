package it.intersistemi.corsojava.networkprogramming;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {

    public static void main(String[] args) {
        Socket connection = null;
        int port = 2345;
        String messageToSend;
        String receivedMessage;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Waiting for connections ");
            while(true){
                connection = serverSocket.accept();
                OutputStream os = connection.getOutputStream();
                PrintWriter pw = new PrintWriter(os);
                InputStreamReader isr = new InputStreamReader(connection.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                InputStreamReader input = new InputStreamReader(System.in);
                BufferedReader keyboard = new BufferedReader(input);
                System.out.println("Chat initialized ");
                while(true){
                    receivedMessage = ConsoleInputString.readString(keyboard, "Insert message: ");
                    if(receivedMessage == null){
                        System.out.println("Client closed chat ");
                        break;
                    }
                    System.out.println(" >> " + receivedMessage);
                    messageToSend = ConsoleInputString.readString(keyboard, "Insert message: ");
                    pw.println(messageToSend);
                    pw.flush();
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
        try{
            connection.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
