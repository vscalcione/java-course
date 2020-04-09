package it.intersistemi.corsojava.exercises;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileSender {

    private Frame frame, clientGui, serverGui;
    private Button clientButton, serverButton, connectButton, fileSelectButton, sendFileButton;
    private Label ipAddress;
    private Panel clientPanel, serverPanel;
    private FileDialog fileDialog;
    private TextField ipTextField, selectedFileName;
    private File file;

    public FileSender(){
        frame = new Frame("FileSender");
        clientButton = new Button("CLIENT");
        serverButton = new Button("SERVER");
    }

    public void setupGUI(){
        clientButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                createClientGui();
                frame.setVisible(false);
            }
        });

        serverButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                createServerGui();
                frame.setVisible(false);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(clientButton, BorderLayout.EAST);
        frame.add(serverButton, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);
    }

    public void createClientGui(){
        clientGui = new Frame("CLIENT");
        clientPanel = new Panel();

        ipAddress = new Label("ENTER SERVER IP");
        clientPanel.add(ipAddress);

        ipTextField = new TextField();
        ipTextField.setPreferredSize(new Dimension(200,20));
        clientPanel.add(ipTextField);

        clientGui.add(clientPanel,BorderLayout.NORTH);

        connectButton = new Button("Connect to the server");
        connectButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Client c = new Client(ipTextField.getText());
                }catch(Exception ev){
                    ev.printStackTrace();
                }
            }
        });

        clientGui.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        clientPanel = new Panel();

        clientPanel.add(connectButton);
        clientGui.add(clientPanel,BorderLayout.SOUTH);

        clientGui.pack();
        clientGui.setVisible(true);
    }

    public void createServerGui(){
        serverGui = new Frame("SERVER");
        serverPanel = new Panel();

        selectedFileName = new TextField();
        selectedFileName.setPreferredSize(new Dimension(200,20));
        serverPanel.add(selectedFileName);

        fileSelectButton = new Button("Select File");
        fileSelectButton.addActionListener(new ActionListener(){
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e){
                fileDialog = new FileDialog(serverGui);
                fileDialog.show();
                file = new File(fileDialog.getDirectory() + fileDialog.getFile());
                selectedFileName.setText(file.getAbsolutePath());
                System.out.println(fileDialog.getFile());
            }
        });

        serverGui.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        serverPanel.add(fileSelectButton);
        serverGui.add(serverPanel, BorderLayout.NORTH);
        serverPanel = new Panel();
        sendFileButton = new Button("Send!");
        sendFileButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Server s = new Server(file);
                }catch(IOException ex){ex.printStackTrace();}
            }
        });

        serverPanel.add(sendFileButton);

        serverGui.add(serverPanel, BorderLayout.SOUTH);

        serverGui.pack();
        serverGui.setVisible(true);
    }

    public static class Client{
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

    public static class Server{
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

    public static void main(String args[]){
        new FileSender().setupGUI();
    }
}

