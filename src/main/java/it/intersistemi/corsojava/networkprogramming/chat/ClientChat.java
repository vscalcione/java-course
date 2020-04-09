package it.intersistemi.corsojava.networkprogramming.chat;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.*;
import java.net.Socket;

public class ClientChat {

    public static void main(String[] args) {
        Socket connection = null;
        String serverName = "localhost";
        int port = 2345;
        String messageToSend;
        String receivedMessage;
        try{
            connection = new Socket(serverName, port);
            System.out.println("Connection successful");
        }catch(IOException e){
            System.out.println(e);
            System.exit(-1);
        }

        try{
            InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = connection.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader keyboard = new BufferedReader(input);
            System.out.println("Chat initialized ");
            while(true){
                messageToSend = ConsoleInputString.readString(keyboard, "Insert message: ");
                if(messageToSend.equals("end")){
                    break;
                }
                pw.println(messageToSend);
                pw.flush();
                receivedMessage = br.readLine();
                System.out.println(" >> " + receivedMessage);

            }
        }catch(IOException e){
            System.out.println(e);
        }try{
            connection.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
