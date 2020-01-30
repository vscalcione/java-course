package it.intersistemi.corsojava.exercises;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class StringServer {
    BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));
    public static ServerSocket server = null;
    public static Socket client = null;
    public static String receivedString;
    public static String sendString;

    public static void serverWaiting(BufferedReader clientInput){
        DataOutputStream clientOutput;
        try{
            System.out.println("Server listening ");
            server = new ServerSocket(8080);
            client = server.accept();
            server.close();
            InputStreamReader clientStream = new InputStreamReader(client.getInputStream());
            clientOutput = new DataOutputStream(client.getOutputStream());
        }catch (IOException exception){
            System.out.println(exception.getMessage());
            System.out.println("Error during server's instance! ");
            System.exit(1);
        }
    }

    public static void serverComunication(BufferedReader clientInput, DataOutputStream clientOutput){
        try{
            System.out.println("Received request ");
            receivedString = clientInput.readLine();
            System.out.println("Received string: " + receivedString);
            receivedString = " " + receivedString.substring(5, receivedString.length() - 8);
            sendString = "<html>" +
                            "<body bgcolor='yellow>'" +
                                "<h2> GoodMorning by Server </h2>" + receivedString +
                            "</body>" +
                        "</html>";
            System.out.println("Sent string to client ");
            clientOutput.writeBytes(sendString + '\n');
            System.out.println("End elaboration ");
            client.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Error during comunication with client! ");
            System.exit(1);
        }
    }

    public static void main(String[] args) throws IOException {
        Socket client = null;
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream clientOutput = new DataOutputStream(client.getOutputStream());
        StringServer server = new StringServer();
        server.serverWaiting(clientInput);
        server.serverComunication(clientInput, clientOutput);
    }
}
